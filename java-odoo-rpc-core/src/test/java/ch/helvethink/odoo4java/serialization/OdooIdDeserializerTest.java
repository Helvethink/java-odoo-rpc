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

package ch.helvethink.odoo4java.serialization;


import ch.helvethink.odoo4java.models.OdooId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class OdooIdDeserializerTest {
    private final OdooIdDeserializer odooIdDeserializer = new OdooIdDeserializer();

    @Test
    void testDeserialize_BooleanNode_ReturnsOdooId() throws IOException {
        final JsonParser jp = Mockito.mock(JsonParser.class);
        final DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        final JsonNode booleanNode = BooleanNode.getTrue();

        Mockito.when(jp.getCodec()).thenReturn(Mockito.mock(com.fasterxml.jackson.databind.ObjectMapper.class));
        Mockito.when(jp.getCodec().readTree(jp)).thenReturn(booleanNode);

        final OdooId result = odooIdDeserializer.deserialize(jp, ctxt);

        assertNotNull(result, "Expected OdooId to be not null");
        assertTrue(result.exists, "Expected OdooId value to be true");
    }

    @Test
    void testDeserialize_ArrayNode_ReturnsOdooId() throws IOException {
        final JsonParser jp = Mockito.mock(JsonParser.class);
        final DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        final ArrayNode arrayNode = Mockito.mock(ArrayNode.class);
        final int expectedId = 123;
        final String expectedText = "test";

        Mockito.when(jp.getCodec()).thenReturn(Mockito.mock(com.fasterxml.jackson.databind.ObjectMapper.class));
        Mockito.when(jp.getCodec().readTree(jp)).thenReturn(arrayNode);
        Mockito.when(arrayNode.get(0)).thenReturn(Mockito.mock(JsonNode.class));
        Mockito.when(arrayNode.get(1)).thenReturn(Mockito.mock(JsonNode.class));
        Mockito.when(arrayNode.get(0).asInt()).thenReturn(expectedId);
        Mockito.when(arrayNode.get(1).asText()).thenReturn(expectedText);

        final OdooId result = odooIdDeserializer.deserialize(jp, ctxt);

        assertNotNull(result, "Expected OdooId to be not null");
        assertEquals(expectedId, result.id, "Expected OdooId id to match");
        assertEquals(expectedText, result.description, "Expected OdooId text to match");
    }

    @Test
    void testDeserialize_UnknownNode_ReturnsDefaultOdooId() throws IOException {
        final JsonParser jp = Mockito.mock(JsonParser.class);
        final DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        final JsonNode unknownNode = Mockito.mock(JsonNode.class);

        Mockito.when(jp.getCodec()).thenReturn(Mockito.mock(com.fasterxml.jackson.databind.ObjectMapper.class));
        Mockito.when(jp.getCodec().readTree(jp)).thenReturn(unknownNode);

        final OdooId result = odooIdDeserializer.deserialize(jp, ctxt);

        assertNotNull(result, "Expected OdooId to be not null");
        assertEquals(0, result.id, "Expected OdooId id to be default value");
        assertNull(result.description, "Expected OdooId text to be null");
    }
}