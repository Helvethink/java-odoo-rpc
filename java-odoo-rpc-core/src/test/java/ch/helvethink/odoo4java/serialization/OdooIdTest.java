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

import ch.helvethink.odoo4java.models.OdooId;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OdooIdTest {

    @Test
    void testIdNull() {
        Integer nullId = null;
        assertFalse(new OdooId(nullId).exists);
        assertFalse(new OdooId(false).exists);
    }

    @Test
    void testWithIdSet() {
        final OdooId odooId = new OdooId(1);
        assertTrue(odooId.exists);
        assertEquals(1, odooId.id);
    }

    @Test
    void testWithIdSetByIdDesc() {
        final OdooId odooId = new OdooId(2, "description");
        assertTrue(odooId.exists);
        assertEquals(2, odooId.id);
        assertEquals("description", odooId.description);
    }

    @Test
    void testWithIdSetByObjectArray() {
        final OdooId odooId = new OdooId(new Object[]{3, "test"});
        assertTrue(odooId.exists);
        assertEquals(3, odooId.id);
        assertEquals("test", odooId.description);
    }

}
