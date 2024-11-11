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
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcStreamTransport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.reflections.Reflections;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.net.MalformedURLException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OdooClientTest {

    @Mock
    XmlRpcClient mockXmlRpcClient;

    @Mock
    XmlRpcStreamTransport xmlRpcStreamTransport;

    OdooClient odooClient;

    @BeforeEach
    void setUp() throws MalformedURLException, XmlRpcException {
        MockitoAnnotations.openMocks(this);
        odooClient = new OdooClient("https://test.local", "database",  "username", "password", false);
        odooClient.commonClient = mockXmlRpcClient;
        odooClient.objectXmlRpcClient = mockXmlRpcClient;
        when(mockXmlRpcClient.execute(ArgumentMatchers.anyString(), ArgumentMatchers.any(List.class))).thenReturn(6);
        projectTask = new ProjectTask();
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
            new OdooClient(mockXmlRpcClient, "https://test.local","demo", "invalid_user", "invalid_password", true);
        });

        final String expectedMessage = "Authentication failed";
        final String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testOkAuthentication() throws XmlRpcException, MalformedURLException {
        when(mockXmlRpcClient.execute(ArgumentMatchers.anyString(), ArgumentMatchers.any(List.class))).thenReturn(6);

        int userId = new OdooClient(mockXmlRpcClient, "https://test.local","demo", "invalid_user", "invalid_password", true).uid;
        Assertions.assertEquals(6, userId);
    }


    private ProjectTask projectTask;

    @Test
    public void testFetchRelationShips() throws Exception {
        // Mocking the dependencies
        final CalendarEvent calendarEvent = mock(CalendarEvent.class);
        final OdooId calendarEventId = new OdooId();
        projectTask.setActivityCalendarEventId(calendarEventId); // Setting the OdooId for the relation

        // Mocking fetchObjectById method
        final OdooClient fetcher = mock(OdooClient.class);
        when(fetcher.fetchObjectById(eq("calendar.event"), any(), any(Class.class))).thenReturn(calendarEvent);

        when(fetcher.fetchRelationShips(any(Object.class),any(List.class))).thenCallRealMethod();
        //(Object[]) objectXmlRpcClient.execute(
        //                    XML_RPC_EXECUTE_METHOD_NAME, asList(
        //                            dbName, uid, password,
        //                            modelName, "read",
        //                            List.of(idsToFetch)));

        // Calling the method
        fetcher.fetchRelationShips(projectTask, getAllClassesInPackage("ch.helvethink.odoo").stream().toList());

        // Asserting that the associated field has been populated
        assertEquals(calendarEvent, projectTask.getActivityCalendarEventIdAsObject());
    }

    @Test
    public void testFetchRecRelationShips() throws Exception {
        // Mocking dependencies
        final List<IrAttachment> attachmentList = Arrays.asList(new IrAttachment(), new IrAttachment());
        projectTask.setAttachmentIds(Arrays.asList(1, 2)); // Set attachment_ids to simulate OdooId list

        // Mocking fetchListByIdsInt method
        final OdooClient fetcher = mock(OdooClient.class);
        when(fetcher.fetchListByIdsInt(eq("ir.attachment"), anyList(), eq(IrAttachment.class))).thenReturn(attachmentList);


        // Calling the method
        when(fetcher.fetchRecursivelyRelationShips(any(Object.class),eq(1),any(List.class))).thenCallRealMethod();
        fetcher.fetchRecursivelyRelationShips(projectTask, 1, getAllClassesInPackage("ch.helvethink.odoo").stream().toList());

        // Asserting that the list field has been populated
        assertEquals(attachmentList, projectTask.getAttachmentIdsAsList());
    }


    static Set<Class<? extends OdooObj>> getAllClassesInPackage(final String packageName) {
        final Reflections reflections = new Reflections(packageName, new TypeAnnotationsScanner());
        return reflections.getSubTypesOf(OdooObj.class);
    }

}

