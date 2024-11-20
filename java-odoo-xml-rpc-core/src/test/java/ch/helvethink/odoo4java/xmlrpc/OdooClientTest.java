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
import ch.helvethink.odoo4java.models.project.ProjectTask;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ch.helvethink.odoo4java.xmlrpc.OdooConstants.XML_RPC_EXECUTE_METHOD_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OdooClientTest {

    @Mock
    XmlRpcClient mockXmlRpcClient;

    OdooClient odooClient;

    @BeforeEach
    void setUp() throws MalformedURLException, XmlRpcException {
        MockitoAnnotations.openMocks(this);
        odooClient = new OdooClient("https://test.local", "database", "username", "password", false);
        odooClient.commonClient = mockXmlRpcClient;
        odooClient.objectXmlRpcClient = mockXmlRpcClient;
        when(mockXmlRpcClient.execute(ArgumentMatchers.anyString(), ArgumentMatchers.any(List.class))).thenReturn(6);
    }

    @Test
    void testGetAllModels() throws XmlRpcException {
        // Get mock when calling mockXmlRpcClient
        final Map<String, Object> mockModel = new HashMap<>();
        mockModel.put("access_ids", new Object[]{1});
        when(mockXmlRpcClient.execute(ArgumentMatchers.any(String.class), ArgumentMatchers.any(Object[].class)))
                .thenReturn(new Object[]{mockModel});

        final List<Map<String, Object>> models = odooClient.getAllModels("");
        Assertions.assertFalse(models.isEmpty(), "Le modèle retourné ne doit pas être vide");
        Assertions.assertEquals(1, models.size(), "La liste doit contenir un élément");
    }

    @Test
    void testGetFields() throws XmlRpcException {
        final Map<String, Map<String, Object>> mockFields = new HashMap<>();
        final Map<String, Object> fieldAttributes = new HashMap<>();
        fieldAttributes.put("string", "name");
        mockFields.put("name", fieldAttributes);

        when(mockXmlRpcClient.execute(ArgumentMatchers.any(String.class), ArgumentMatchers.any(Object[].class)))
                .thenReturn(mockFields);

        final Map<String, Map<String, Object>> fields = odooClient.getFields("test_model");
        Assertions.assertEquals("name", fields.get("name").get("string"));
    }

    @Test
    void testInvalidAuthentication() throws XmlRpcException {
        when(mockXmlRpcClient.execute(ArgumentMatchers.anyString(), ArgumentMatchers.any(List.class))).thenReturn(Boolean.FALSE);

        final Exception exception = Assertions.assertThrows(XmlRpcException.class, () -> {
            new OdooClient(mockXmlRpcClient, "https://test.local", "demo", "invalid_user", "invalid_password", true);
        });

        final String expectedMessage = "Authentication failed";
        final String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testOkAuthentication() throws XmlRpcException, MalformedURLException {
        when(mockXmlRpcClient.execute(ArgumentMatchers.anyString(), ArgumentMatchers.any(List.class))).thenReturn(6);

        int userId = new OdooClient(mockXmlRpcClient, "https://test.local", "demo", "invalid_user", "invalid_password", true).uid;
        Assertions.assertEquals(6, userId);
    }

    @Test
    void testFetchByNames() throws XmlRpcException {
        final OdooClient odooCli = mock(OdooClient.class);
        odooCli.objectXmlRpcClient = mockXmlRpcClient;

        Object[] mockedId = new Object[]{new Object[]{0}};
        ProjectTask projectTask = new ProjectTask();
        projectTask.setName("test");
        projectTask.setId(0);
        when(mockXmlRpcClient.execute(eq(XML_RPC_EXECUTE_METHOD_NAME), anyList())).thenReturn(mockedId);
        when(odooCli.findListByIdsInt(List.of(0), ProjectTask.class))
                .thenReturn(Collections.singletonList(projectTask));
        when(odooCli.findByNames(ProjectTask.class, List.of("test"))).thenCallRealMethod();
        assertEquals("test", odooCli.findByNames(ProjectTask.class, List.of("test")).get(0).getName());
    }

    @Test
    void testFindByEmptyIds() throws XmlRpcException {
        assertEquals(Collections.emptyList(), odooClient.findListByIds(Collections.emptyList(), ProjectTask.class));
        assertEquals(Collections.emptyList(), odooClient.findListByIds(null, ProjectTask.class));
        assertNull(odooClient.findObjectById(null, ProjectTask.class));
        assertNull(odooClient.findObjectById(new OdooId(false), ProjectTask.class));
    }

}

