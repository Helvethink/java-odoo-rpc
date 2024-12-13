/*
 * MIT License
 *
 * Copyright (c) 2024 Helvethink
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.helvethink.odoo4java.generator;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.FileOutput;
import org.codehaus.plexus.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

import static ch.helvethink.odoo4java.generator.ClassTools.getJavaType;
import static ch.helvethink.odoo4java.generator.ClassTools.sanitizeClassName;
import static ch.helvethink.odoo4java.generator.OdooConstants.RELATION_FIELD_NAME;
import static ch.helvethink.odoo4java.tools.FieldUtils.formatFieldName;
import static org.apache.commons.lang3.StringUtils.capitalize;

/**
 * Main class to generate models.
 */
public final class ClassGenerator {

    /**
     * Simple Logger
     */
    public static final Logger LOG = LoggerFactory.getLogger(ClassGenerator.class.getName());

    /**
     * ClassGenerator is a tooling class, no visible constructor
     */
    private ClassGenerator() {
        // Tooling class
    }

    /**
     * Main method to generate a class for a model
     * All attributes of the object are public (no getters and setters), this is very conscious
     *
     * @param pathToGenerate Path where we want to generate files - default will be "target"
     * @param modelName      Name of the model we want to generate a class for
     * @param fields         Fields that have been returned from Odoo for this model
     * @throws IOException If we can't write to the destination directory
     */
    public static void generateClass(final List<String> excludedPrefixes, final List<String> includedPrefixes, final String pathToGenerate, final String generatedRootPackage, final String modelName, final Map<String, Map<String, Object>> fields) throws IOException {
        LOG.debug("generating from {}", modelName);

        final String rootPackage = StringUtils.isEmpty(generatedRootPackage) ? "ch.helvethink.odoo4java.models.generated." : (generatedRootPackage + ".");
        final String classfqdn = computeClassFQDN(modelName);
        // If classFDQN is not empty, then we check for included prefix.
        boolean mustGenerateClass = !StringUtils.isEmpty(classfqdn);
        // If includedPrefixes is not empty we generate only if the class match with included prefix
        mustGenerateClass = mustGenerateClass && (!includedPrefixes.isEmpty() && includedPrefixes.stream().anyMatch(classfqdn::startsWith)) ||
                // Otherwise, when includedPrefix is empty we must check if excludedPrefix is empty then we just don't have any filter
                // If not, we must check that we are not on exclusion case
                (includedPrefixes.isEmpty() && (excludedPrefixes.isEmpty() || excludedPrefixes.stream().noneMatch(classfqdn::startsWith)));
        // If there is exclusion then we must check if we're part of the exclusion
        if (mustGenerateClass) {
            final String packageName = classfqdn.substring(0, classfqdn.lastIndexOf("."));
            final String className = StringUtils.capitaliseAllWords(classfqdn.substring(classfqdn.lastIndexOf(".") + 1));
            LOG.info("Generating {}{}.{}", rootPackage, packageName, className);
            LOG.debug("From modelName, packageName is {} and className is {}", packageName, className);

            final String directory = pathToGenerate + "/" + rootPackage.replace(".", "/") + packageName.replace(".", "/");
            Files.createDirectories(Path.of(directory));

            final StringBuilder headOfClass = new StringBuilder();
            final StringBuilder classContent = new StringBuilder();

            headOfClass.append("package ").append(rootPackage).append(packageName).append(";\n");
            headOfClass.append("import ch.helvethink.odoo4java.models.OdooObject;\n");
            headOfClass.append("import ch.helvethink.odoo4java.models.OdooObj;\n");

            final Set<String> importsToAdd = new HashSet<>();

            classContent.append("@OdooObject(\"").append(modelName).append("\")\n");
            classContent.append("public class ").append(className).append(" implements OdooObj {\n\n");

            for (final Map.Entry<String, Map<String, Object>> entry : fields.entrySet()) {
                final Map<String, Object> fieldProps = entry.getValue();
                final String fieldRelation = fieldProps.get(RELATION_FIELD_NAME) != null ? computeClassFQDN(fieldProps.get(RELATION_FIELD_NAME).toString()) : null;
                final boolean fieldMustBeCreated = fieldRelation == null ||
                        (!includedPrefixes.isEmpty() && includedPrefixes.stream().anyMatch(fieldRelation::startsWith)) ||
                        // Otherwise, when includedPrefix is empty we must check if excludedPrefix is empty then we just don't have any filter
                        // If not, we must check that we are not on exclusion case
                        (includedPrefixes.isEmpty() && (excludedPrefixes.isEmpty() || excludedPrefixes.stream().noneMatch(fieldRelation::startsWith)));
                final String fieldType = getJavaType(fieldProps.get("type").toString());
                final String fieldNameSanitized = "boolean".equals(fieldType) ? "is" + capitalize(entry.getKey()) : entry.getKey();

                if (fieldType.equals("OdooId") && fieldRelation != null && fieldMustBeCreated) {
                    LOG.debug("field relation {} has been translated to {}", fieldProps.get(RELATION_FIELD_NAME), fieldRelation);

                    importsToAdd.add("ch.helvethink.odoo4java.models.OdooId");
                    // Add one more field "AsObject" so we can fetch into it using tools
                    final String fieldRelationImport = rootPackage + fieldRelation;
                    if (!fieldRelationImport.equals(packageName)) {
                        importsToAdd.add(fieldRelationImport);
                    }
                    classContent.append("    public " + fieldRelation.substring(fieldRelation.lastIndexOf(".") + 1) + " " + (fieldNameSanitized + "AsObject") + ";\n");
                }
                if (fieldType.equals("List<Integer>") && fieldRelation != null && fieldMustBeCreated) {
                    importsToAdd.add("java.util.List");
                    // Add one more field "AsList" so we can fetch into it using tools
                    classContent.append("    public List<" + fieldRelation.substring(fieldRelation.lastIndexOf(".") + 1) + ">" + " " + (fieldNameSanitized + "AsList") + ";\n");
                    final String fieldRelationImport = rootPackage + fieldRelation;
                    if (!fieldRelationImport.equals(packageName)) {
                        importsToAdd.add(fieldRelationImport);
                    }
                }

                if (fieldProps.get(RELATION_FIELD_NAME) != null && fieldMustBeCreated) {
                    importsToAdd.add("ch.helvethink.odoo4java.models.OdooId");

                    if (fieldRelation != null && !fieldRelation.isEmpty()) {
                        importsToAdd.add("ch.helvethink.odoo4java.models.FieldRelation");
                        importsToAdd.add("ch.helvethink.odoo4java.models.OdooModel");
                        classContent.append("    @FieldRelation(\"").append(rootPackage, 0, rootPackage.lastIndexOf(".") + 1).append(fieldRelation).append("\")\n");
                        classContent.append("    @OdooModel(\"").append(fieldRelation).append("\")\n");
                    }
                }
                if (fieldMustBeCreated) {
                    classContent.append("    public ").append(fieldType).append(" ").append(fieldNameSanitized)
                            .append(";\n");
                }

            }

            classContent.append("}");
            headOfClass.append(importsToAdd.stream().map(imp -> ("import " + imp + ";")).collect(Collectors.joining("\n")));
            headOfClass.append("\n\n");

            try (final FileWriter fileWriter = new FileWriter(directory + "/" + className + ".java")) {
                fileWriter.write(headOfClass.toString());
                fileWriter.write(classContent.toString());
            }

        }

    }


    /**
     * Main method to generate a class for a model
     * All attributes of the object are public (no getters and setters), this is very conscious
     *
     * @param pathToGenerate Path where we want to generate files - default will be "target"
     * @param modelName      Name of the model we want to generate a class
     * @param fields         Fields that have been returned from Odoo for this model
     * @throws IOException If we can't write to the destination directory
     */
    public static void generateClassNG(final List<String> excludedPrefixes, final List<String> includedPrefixes, final String pathToGenerate, final String generatedRootPackage, final String modelName, final Map<String, Map<String, Object>> fields) throws IOException {
        LOG.debug("generating from {}", modelName);

        final List<FieldTemplate> fieldsToCreate = new ArrayList<>();
        // Import list is used as string to avoid double line breaks from jte
        final Set<String> listOfImports = new HashSet<>();
        listOfImports.add("import ch.helvethink.odoo4java.models.OdooObject;");
        listOfImports.add("import ch.helvethink.odoo4java.models.OdooObj;");
        listOfImports.add("import com.fasterxml.jackson.annotation.JsonProperty;");

        final String rootPackage = StringUtils.isEmpty(generatedRootPackage) ? "ch.helvethink.odoo4java.models.generated." : (generatedRootPackage + ".");
        final String classfqdn = computeClassFQDN(modelName);
        if (!StringUtils.isEmpty(classfqdn) && (includedPrefixes.isEmpty() || includedPrefixes.stream().anyMatch(classfqdn::startsWith) || !excludedPrefixes.isEmpty() && excludedPrefixes.stream().noneMatch(classfqdn::startsWith))) {
            final String currentClassPackageName = classfqdn.substring(0, classfqdn.lastIndexOf("."));
            final String className = StringUtils.capitaliseAllWords(classfqdn.substring(classfqdn.lastIndexOf(".") + 1));
            LOG.info("Generating {}{}.{}", rootPackage, currentClassPackageName, className);
            LOG.debug("From modelName, packageName is {} and className is {}", currentClassPackageName, className);

            final String directory = pathToGenerate + "/" + rootPackage.replace(".", "/") + currentClassPackageName.replace(".", "/");
            Files.createDirectories(Path.of(directory));

            for (final Map.Entry<String, Map<String, Object>> entry : fields.entrySet()) {
                final Map<String, Object> fieldProps = entry.getValue();
                final String fieldRelation = fieldProps.get(RELATION_FIELD_NAME) != null ? computeClassFQDN(fieldProps.get(RELATION_FIELD_NAME).toString()) : null;
                final boolean fieldMustBeCreated = fieldRelation == null || (includedPrefixes.isEmpty() || includedPrefixes.stream().anyMatch(fieldRelation::startsWith)) || !excludedPrefixes.isEmpty() && excludedPrefixes.stream().noneMatch(fieldRelation::startsWith);
                final String fieldType = getJavaType(fieldProps.get("type").toString());
                final String fieldNameSanitized = "boolean".equals(fieldType) ? "is" + capitalize(entry.getKey()) : entry.getKey();

                if (fieldMustBeCreated) {
                    if("Date".equals(fieldType)) {
                        listOfImports.add("import java.util.Date;");
                    }

                    FieldTemplate newField = new FieldTemplate(entry.getKey(), formatFieldName(fieldNameSanitized), fieldType);

                    if (fieldRelation != null) {
                        listOfImports.add("import ch.helvethink.odoo4java.models.FieldRelation;");
                        listOfImports.add("import ch.helvethink.odoo4java.models.OdooModel;");

                        final String fieldRelationImport = rootPackage + fieldRelation;

                        newField.setFieldModel(fieldRelation);
                        newField.setFieldRelation(fieldRelationImport);
                        // If generated class and its field are in the same package there's no need to import
                        if (!fieldRelationImport.equals(currentClassPackageName)) {
                            listOfImports.add("import " + fieldRelationImport + ";");
                        }

                        switch (fieldType) {
                            case "OdooId":
                                newField.setOdooId(true);
                                listOfImports.add("import ch.helvethink.odoo4java.models.OdooId;");
                                fieldsToCreate.add(new FieldTemplate(newField));
                                break;
                            case "List<Integer>":
                                listOfImports.add("import java.util.List;");
                                newField.setOdooListIds(true);
                                fieldsToCreate.add(new FieldTemplate(newField));
                                break;
                            default:
                                break;
                        }
                    }
                    fieldsToCreate.add(newField);
                }

                TemplateEngine templateEngine = TemplateEngine.createPrecompiled(ContentType.Plain);
                try (final FileOutput output = new FileOutput(Path.of(directory + "/" + className + ".java"))) {
                    templateEngine.render("JavaClass", new TemplateData(rootPackage + currentClassPackageName, modelName, className, String.join("\n", listOfImports), fieldsToCreate), output);
                }
            }
        }

    }

    public record TemplateData(String packageName, String modelName, String className, String importsList, List<FieldTemplate> fields) {
    }

    /**
     * Compute the class full qualified name from an Odoo model name
     *
     * @param modelName The name of the Odoo model as it is returned by the Odoo instance
     * @return The class FQDN, i.e. packageName + class
     */
    static String computeClassFQDN(final String modelName) {
        final String[] splittedModelName = modelName.split("\\.");
        if (modelName.split("\\.").length < 2) {
            return computeClassFQDN("generic." + modelName);
        }
        if (Arrays.asList(modelName.split("\\.")).contains("import")) {
            //specific for ImportModule (because "import" totally sucked as object name)
            return computeClassFQDN(modelName.replace("import", "odooimport"));
        }
        final StringBuilder classfqdnSB = new StringBuilder();
        // There's at least one element as package name into the model
        classfqdnSB.append(splittedModelName[0]);
        for (int i = 1; i < splittedModelName.length; i++) {
            if (i == splittedModelName.length - 1) {
                // 2 use cases to manage: AccountAccount and AccountXXX for Instance
                if (splittedModelName[i - 1].equals(splittedModelName[i].toLowerCase())) {
                    classfqdnSB.append(".").append(capitalize(splittedModelName[i].toLowerCase()));
                } else {
                    classfqdnSB.append(".").append(sanitizeClassName(modelName));
                }
            } else {
                classfqdnSB.append(".").append(splittedModelName[i].toLowerCase());
            }
        }
        return classfqdnSB.toString();
    }
}
