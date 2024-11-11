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

package ch.helvethink.odoo4java.tools;

import org.codehaus.plexus.util.StringUtils;

/**
 * Tooling class for fields
 */
public class FieldUtils {

    /**
     * No visible constructor
     */
    private FieldUtils() {
        // No constructor
    }

    /**
     * Sanitize field name to make it compliant with Java best practices
     * @param fieldName The field name to sanitize
     * @return fieldName in CamelCase
     */
    public static String formatFieldName(final String fieldName) {
        final String[] splittedFieldName = fieldName.split("_");
        final StringBuilder sanitizedFieldName = new StringBuilder();
        // There's at least one element as package name into the model
        sanitizedFieldName.append(splittedFieldName[0]);
        for (int i = 1; i < splittedFieldName.length; i++) {
            sanitizedFieldName.append(StringUtils.capitalizeFirstLetter(splittedFieldName[i]));
        }
        return sanitizedFieldName.toString();
    }

}
