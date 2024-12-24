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

package ch.helvethink.odoo4java.models;

/**
 * Encapsulate an Odoo Id
 * Can be an object "false" due to xmlrpc implementation from Odoo
 */
public class OdooId {

    /**
     * Id if real Id
     */
    public int id;

    /**
     * Description of the identifier
     * Not really useful except when debugging
     */
    public String description;

    /**
     * Does the Id really exists
     * In some cases null values are handled like a Boolean equals to false
     */
    public boolean exists = true;

    /**
     * Default constructor
     */
    public OdooId() {

    }

    /**
     * Simple constructor with an Integer object as id
     * @param id the id of the Odoo object
     */
    public OdooId(Integer id) {
        if(id != null) {
            this.id = id;
        } else {
            this.exists=false;
        }
    }

    /**
     * Constructor with boolean - useful for null values
     *
     * @param b Should always be false - describe if the id exists
     */
    public OdooId(final Boolean b) {
        exists = b;
    }

    /**
     * Constructor with id and description
     *
     * @param id   The id of the target field
     * @param desc The description of the target field, provided by Odoo
     */
    public OdooId(final int id, final String desc) {
        this.id = id;
        this.description = desc;
    }

    /**
     * Constructor with array of objects
     * For some reason sometimes Odoo sent ids under this format
     * @param idRepresentation The pair (id, description)
     */
    public OdooId(final Object[] idRepresentation) {
        if (idRepresentation.length == 2) {
            id = (int) idRepresentation[0];
            description = (String) idRepresentation[1];
        }
    }

}
