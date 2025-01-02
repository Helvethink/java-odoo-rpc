/*
 * MIT License
 *
 * Copyright (c) 2025 Helvethink
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

package ch.helvethink.odoo4java.serialization;

import com.fasterxml.jackson.databind.DeserializationFeature;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static ch.helvethink.odoo4java.serialization.OdooDateDeserializer.DEFAULT_DATE_FORMAT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class OdooObjectMapperTest {
    @Test
    void testObjectMapperInitialization() {
        final OdooObjectMapper odooObjectMapper = new OdooObjectMapper();
        Date d = new Date(2025 - 1900,0, 1);
        assertEquals("2025-01-01 12:00:00", odooObjectMapper.getDateFormat().format(d));
        assertFalse(odooObjectMapper.getDeserializationConfig().isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(odooObjectMapper.getDeserializationConfig().isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE));
        assertFalse(odooObjectMapper.getDeserializationConfig().isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES));
        assertFalse(odooObjectMapper.getDeserializationConfig().isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES));
    }
}
