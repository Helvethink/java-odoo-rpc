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

package ch.helvethink.odoo4java;

import ch.helvethink.odoo4java.generator.ClassGenerator;
import ch.helvethink.odoo4java.xmlrpc.OdooClient;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.xmlrpc.XmlRpcException;
import org.codehaus.plexus.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

/**
 * Goal which generates classes from an Odoo instance, using XML-RPC (ch.helvethink.odoo.generator: generate)
 */
@Mojo(name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class GeneratorMojo extends AbstractMojo {
    /**
     * Simple logger
     */
    public static final Logger LOG = LoggerFactory.getLogger(GeneratorMojo.class.getName());
    public static final String INFO_SEPARATOR = " - ";

    /**
     * Username to access Odoo models that are present in you Odoo instance
     */
    @Parameter(defaultValue = "${odoo.username}", property = "username", required = true)
    private String odooUsername;

    /**
     * Password for accessing the Odoo Instance
     */
    @Parameter(defaultValue = "${odoo.password}", property = "password", required = true)
    private String odooPassword;

    /**
     * Database containing the models you want to generate
     */
    @Parameter(defaultValue = "${odoo.database}", property = "database", required = true)
    private String odooDatabase;

    /**
     * Instance URI
     */
    @Parameter(defaultValue = "${odoo.instance}", property = "url", required = true)
    private String odooInstanceUrl;

    @Parameter(defaultValue = "${odoo.generation.path}", property = "path")
    private String generatedClassPath;

    @Parameter(defaultValue = "${odoo.generation.package}", property = "generationPackage")
    private String generatedClassesRootPackage;

    @Parameter(defaultValue = "", property = "exclusions")
    private List<String> excludedPrefixes;

    @Parameter(defaultValue = "", property = "inclusions")
    private List<String> includedPrefixes;

    /**
     * Main entrypoint for the plugin (ch.helvethink.odoo.generator: generate)
     *
     * @throws MojoExecutionException
     */
    public void execute() throws MojoExecutionException {
        try {
            final String rootPathForGeneratedClasses = StringUtils.isEmpty(generatedClassPath) ? "target/generated-sources" : generatedClassPath;

            final ch.helvethink.odoo4java.xmlrpc.OdooClient client = new OdooClient(odooInstanceUrl, odooDatabase, odooUsername, odooPassword);

            if (!excludedPrefixes.isEmpty() && !includedPrefixes.isEmpty()) {
                throw new RuntimeException("excluded and included are mutually exclusive, choose your way"); // NOSONAR
            }

            StringBuilder infos = new StringBuilder();
            infos
                    .append("odoo server version: ").append(client.getVersion()).append(INFO_SEPARATOR)
                    .append("uri: ").append(odooInstanceUrl).append(INFO_SEPARATOR)
                    .append("user: ").append(odooUsername).append(INFO_SEPARATOR)
                    .append("generated classes root folder: ").append(generatedClassesRootPackage).append(INFO_SEPARATOR)
                    .append("generated classes path: ").append(generatedClassPath);

            if (LOG.isInfoEnabled()) {
                LOG.info(infos.toString().replace(INFO_SEPARATOR, "\n"));
            }

            Path infoPath = Path.of(rootPathForGeneratedClasses + "/odoo-generator.info");
            if (Files.exists(infoPath)) {
                String previousExecutionResult = Files.readString(infoPath);
                if (previousExecutionResult.contentEquals(infos)) {
                    LOG.info("Classes do not need to be regenerated");
                    return;
                }
            }

            final List<Map<String, Object>> modelsToGenerate = client.getAllModels("");

            for (final Map<String, Object> model : modelsToGenerate) {
                final String modelName = (String) model.get("model");
                if (!modelName.endsWith("Test") && !modelName.endsWith("test")) {
                    ClassGenerator.generateClassNG(excludedPrefixes, includedPrefixes, rootPathForGeneratedClasses, generatedClassesRootPackage, modelName, client.getFields(modelName));
                }
            }

            // Here we write information regarding the latest generation
            try (final FileWriter fileWriter = new FileWriter(rootPathForGeneratedClasses + "/" + "odoo-generator.info")) {
                fileWriter.write(infos.toString());
            }


            LOG.info("Generation of models is finished");
        } catch (final XmlRpcException | IOException e) {
            throw new MojoExecutionException("Models cannot be generated", e);
        }
    }
}
