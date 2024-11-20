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

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Simple constants class
 */
public final class OdooConstants {
    /**
     * Odoo XML-RPC API main method
     */
    public static final String XML_RPC_EXECUTE_METHOD_NAME = "execute_kw";

    /**
     * Odoo XML-RPC API Introspection for models
     */
    public static final String ODOO_INSTROSPECTION_MODEL = "ir.model";
    /**
     * Odoo XML-RPC API search method
     */
    public static final String ODOO_SEARCH_READ_API = "search_read";
    /**
     * Odoo XML-RPC API Name search method
     */
    public static final String ODOO_NAME_SEARCH_API = "name_search";
    /**
     * Odoo XML-RPC API fetch fields method
     */
    public static final String ODOO_FETCH_FIELDS_API = "fields_get";
    /**
     * Odoo XML-RPC API attributes we want to fetch when fetching fields of a model
     */
    protected static final List<String> ATTRIBUTES_FOR_FETCHED_FIELDS = asList("string", "help", "type", "relation");
    /**
     * Odoo XML-RPC API specific field. When this field does not exists it means that the model is not accessible through API.
     */
    public static final String MANDATORY_FIELD_FOR_ACCESSING_MODEL = "access_ids";


    /**
     * No public constructor - constants class
     */
    private OdooConstants() {
        // Constants class
    }
}
