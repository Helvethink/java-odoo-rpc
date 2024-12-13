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

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import static ch.helvethink.odoo4java.serialization.OdooConstants.XML_RPC_EXECUTE_METHOD_NAME;
import static java.util.Arrays.asList;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * Unit tests for the {@link OdooClient} class.
 */

class OdooClientUnitTest {

    private OdooXmlRpcClient mockedClient;

    private Object[] objects;

    private OdooClient odooClient;

    List expectedParametersForFindById = asList("testDB", 0, "testPassword", "model.test", "read", List.of(List.of(0,1,2)));

    @BeforeEach
    public void setUpMock() throws MalformedURLException {
        // Create mock dependencies
        mockedClient = mock(OdooXmlRpcClient.class);
        // Return these objects when call for search
        objects = new Object[3];
        objects[0] = Map.of(
                "name", "Object 0"
        );
        objects[1] = Map.of(
                "name", "Object 1"
        );
        objects[2] = Map.of(
                "name", "Object 2"
        );
        odooClient = new OdooClient(mockedClient, "http://localhost", "testDB", "testUser", "testPassword", false);
        odooClient.objectXmlRpcClient = mockedClient;
    }
    /**
     * Unit tests for the 'findByCriterias()' method.
     */
    @Test
    void testFindByCriteria() {
        // Stub the execute() method call
        when(mockedClient.execute(eq(XML_RPC_EXECUTE_METHOD_NAME), anyList())).thenReturn(objects);

        // Test the method
        List<MyObj> result = odooClient.findByCriteria(3, MyObj.class, "criteria1", "criteria2", "criteria3");

        // Verify the method was called correctly
        verify(mockedClient).execute(eq(XML_RPC_EXECUTE_METHOD_NAME), anyList());

        // Assert result 
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("Object 0", result.get(0).name);
        assertEquals("Object 1", result.get(1).name);
        assertEquals("Object 2", result.get(2).name);
    }

    @Test
    void fetchListByIdsInt() {
        when(mockedClient.execute(eq(XML_RPC_EXECUTE_METHOD_NAME), anyList())).thenReturn(objects);
        List<MyObj> result = odooClient.findListByIdsInt(List.of(0,1,2), MyObj.class);
        verify(mockedClient).execute(XML_RPC_EXECUTE_METHOD_NAME, expectedParametersForFindById);

        assertEquals(3, result.size());
        assertEquals("Object 0", result.get(0).name);
        assertEquals("Object 1", result.get(1).name);
        assertEquals("Object 2", result.get(2).name);
    }


    @Test
    void fetchListByIds() {
        OdooId odooId0 = new OdooId(0, "test 0");
        OdooId odooId1 = new OdooId(new Object[]{1, "test 1"});
        assertEquals("test 1", odooId1.description);
        assertEquals(1, odooId1.id);
        assertTrue(odooId1.exists);
        OdooId odooId2 = new OdooId(2, "test 2");
        when(mockedClient.execute(eq(XML_RPC_EXECUTE_METHOD_NAME), anyList())).thenReturn(objects);

        List<MyObj> result = odooClient.findListByIds(List.of(odooId0,odooId1,odooId2), MyObj.class);
        verify(mockedClient).execute(XML_RPC_EXECUTE_METHOD_NAME, expectedParametersForFindById);

        assertEquals(3, result.size());
        assertEquals("Object 0", result.get(0).name);
        assertEquals("Object 1", result.get(1).name);
        assertEquals("Object 2", result.get(2).name);
    }

    @Test
    void findObjectByOdooId() {
        OdooId odooId2 = new OdooId(2, "test 2");
        when(mockedClient.execute(eq(XML_RPC_EXECUTE_METHOD_NAME), anyList())).thenReturn(new Object[]{objects[2]});

        MyObj result = odooClient.findObjectById( odooId2, MyObj.class);
        verify(mockedClient).execute(XML_RPC_EXECUTE_METHOD_NAME, List.of("testDB", 0, "testPassword", "model.test", "read", List.of(2)));

        assertEquals("Object 2", result.name);
    }

    /**
     * A stub class to represent any class that extends OdooObj.
     */
    @OdooObject("model.test")
    private static class MyObj implements OdooObj {
        public String name;
    }
}