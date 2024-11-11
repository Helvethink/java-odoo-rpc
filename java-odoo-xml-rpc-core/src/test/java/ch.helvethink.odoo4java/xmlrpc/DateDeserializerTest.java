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

package ch.helvethink.odoo4java.xmlrpc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateDeserializerTest {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private final OdooDateDeserializer dateDeserializer = new OdooDateDeserializer();

    @Test
    void testDeserialize_BooleanNode_ReturnsNull() throws IOException {
        final JsonParser jp = Mockito.mock(JsonParser.class);
        final DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        final JsonNode booleanNode = BooleanNode.getFalse();

        Mockito.when(jp.getCodec()).thenReturn(Mockito.mock(com.fasterxml.jackson.databind.ObjectMapper.class));
        Mockito.when(jp.getCodec().readTree(jp)).thenReturn(booleanNode);

        final Date result = dateDeserializer.deserialize(jp, ctxt);

        assertNull(result, "Expected null for BooleanNode");
    }

    @Test
    void testDeserialize_ValidDate_ReturnsDate() throws IOException, ParseException {
        final JsonParser jp = Mockito.mock(JsonParser.class);
        final DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        final String dateStr = "2024-11-05";
        final JsonNode dateNode = Mockito.mock(JsonNode.class);

        Mockito.when(jp.getCodec()).thenReturn(Mockito.mock(com.fasterxml.jackson.databind.ObjectMapper.class));
        Mockito.when(jp.getCodec().readTree(jp)).thenReturn(dateNode);
        Mockito.when(dateNode.asText()).thenReturn(dateStr);

        final Date expectedDate = DATE_FORMAT.parse(dateStr);
        final Date result = dateDeserializer.deserialize(jp, ctxt);

        assertEquals(expectedDate, result, "Expected deserialized date to match input string");
    }

    @Test
    void testDeserialize_InvalidDate_ThrowsRuntimeException() throws IOException {
        final JsonParser jp = Mockito.mock(JsonParser.class);
        final DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        final String invalidDateStr = "invalid-date";
        final JsonNode invalidDateNode = Mockito.mock(JsonNode.class);

        Mockito.when(jp.getCodec()).thenReturn(Mockito.mock(com.fasterxml.jackson.databind.ObjectMapper.class));
        Mockito.when(jp.getCodec().readTree(jp)).thenReturn(invalidDateNode);
        Mockito.when(invalidDateNode.asText()).thenReturn(invalidDateStr);

        final RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            dateDeserializer.deserialize(jp, ctxt);
        });

        assertInstanceOf(ParseException.class, thrown.getCause(), "Expected a ParseException as cause");
    }
}
