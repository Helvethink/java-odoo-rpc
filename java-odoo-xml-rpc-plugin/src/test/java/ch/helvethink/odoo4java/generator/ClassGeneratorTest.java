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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;


class ClassGeneratorTest {

    @AfterEach
    void deleteDirectory() throws IOException {
        try (Stream<Path> paths = Files.walk(Path.of("target/generated-sources/ch/helvethink/odoo/models/generated"))) {
            paths.sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
        }
    }

    @Test
    void testGenerateClass_SimpleModel() throws IOException {
        // Arrange
        final String modelName = "res.partner";
        final Map<String, Map<String, Object>> fields = new HashMap<>();

        fields.put("name", Map.of("type", "string"));
        fields.put("age", Map.of("type", "integer"));

        // Act
        ClassGenerator.generateClassNG(Collections.emptyList(), Collections.emptyList(), "target/generated-sources", "ch.helvethink.odoo.models.generated", modelName, fields);

        // Assert
        final File generatedFile = new File("target/generated-sources/ch/helvethink/odoo/models/generated/res/ResPartner.java");
        assertTrue(generatedFile.exists(), "File should have been created");
    }

    @Test
    void testGenerateClass_WithRelations() throws IOException {
        // Arrange
        final String modelName = "project.task";
        final Map<String, Map<String, Object>> fields = new HashMap<>();

        fields.put("name", Map.of("type", "string"));
        fields.put("user_id", Map.of("type", "many2one", "relation", "res.users"));

        ClassGenerator.generateClassNG(Collections.emptyList(), Collections.emptyList(), "target/generated-sources", "ch.helvethink.odoo.models.generated", modelName, fields);

        // Assert
        final File generatedFile = new File("target/generated-sources/ch/helvethink/odoo/models/generated/project/ProjectTask.java");
        assertTrue(generatedFile.exists(), "File should have been created");
    }

}
