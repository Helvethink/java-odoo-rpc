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
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.BooleanNode;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Custom deserializer for date (when null a Boolean is returned by Odoo)
 */
public class OdooDateDeserializer extends StdDeserializer<Date> {

    /**
     * Default DateFormat used By Odoo
     */
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
    /**
     * Long Date format
     */
    private final SimpleDateFormat longDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
    /**
     * Short Date format
     */
    private final SimpleDateFormat shortDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Default constructor
     */
    public OdooDateDeserializer() {
        super(Date.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException {
        final JsonNode node = jp.getCodec().readTree(jp);

        try {
            if (BooleanNode.class.equals(node.getClass())) {
                return null;
            } else {
                final String dateAsString = node.asText();
                if(dateAsString.length() > 10) {
                    return longDateFormat.parse(dateAsString);
                } else {
                    return shortDateFormat.parse(dateAsString);
                }
            }
        } catch (final ParseException e) {
            throw new RuntimeException(e); // NOSONAR
        }
    }

}