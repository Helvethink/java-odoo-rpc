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

import org.apache.commons.lang3.StringUtils;

/**
 * Some tools for the classes we want to generate
 */
public final class ClassTools {

    private ClassTools() {
        // Tooling class
    }

    /**
     * Sanitize class names, i.e. compliant with Java and Camel Cased
     * @param c className
     * @return The class name sanitized
     */
    public static String sanitizeClassName(final String c) {
        final String[] classNameSplitted = c.split("\\.");
        final StringBuilder sb = new StringBuilder();
        for (final String partOfClassName : classNameSplitted) {
            sb.append(StringUtils.capitalize(partOfClassName));
        }
        return sb.toString()
                .replace(" ", "")
                .replace(".", "")
                .replace("/", "")
                .replace(",", "")
                .replace("-", "")
                .replace("2", "Two")
                .replace("'", "")
                .replaceAll("\\(.*\\)", "");
    }

    /**
     * Mapping between odooType and Java type
     * @param odooType The Odoo type for a field
     * @return The corresponding Java type
     */
    public static String getJavaType(final String odooType) {
        return switch (odooType) {
            case "integer" -> "int";
            case "char" -> "String";
            case "boolean" -> "boolean";
            case "float" -> "double";
            case "many2one" -> "OdooId";
            case "one2many", "many2many" -> "List<Integer>";
            case "datetime", "date" -> "Date";
            default -> "Object";
        };
    }
}
