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

package ch.helvethink.odoo4java.jsonrpc;

import ch.helvethink.odoo4java.FetchException;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.project.Project;
import okhttp3.*;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static ch.helvethink.odoo4java.jsonrpc.LatestRequestBodyHolder.sentRequests;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OdooClientTest {

    private OdooClient odooClient;

    @Mock
    private OkHttpClient mockHttpClient;

    @Mock
    private Response mockResponse;

    @BeforeEach
    void setUp() throws IOException {
        MockitoAnnotations.openMocks(this);
        // use debug mode to get latest sent request to check if they are what we expect
        JsonRPCRequestBuilder.isDebugging = true;

        when(mockResponse.isSuccessful()).thenReturn(true);
        when(mockResponse.code()).thenReturn(200);
        when(mockResponse.body()).thenReturn(mock(ResponseBody.class));
        when(mockResponse.body().string()).thenReturn("{\"result\": 1}");
        when(mockHttpClient.newCall(any(Request.class))).thenReturn(new Call() {
            @NotNull
            @Override
            public Request request() {
                return mockResponse.request();
            }

            @NotNull
            @Override
            public Response execute() throws IOException {
                return mockResponse;
            }

            @Override
            public void enqueue(@NotNull final Callback callback) {

            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @NotNull
            @Override
            public Timeout timeout() {
                return null;
            }

            @NotNull
            @Override
            public Call clone() {
                return null;
            }
        });

        odooClient = new OdooClient(mockHttpClient, "http://example.com", "test_db", "user", "password", false);
    }

    @Test
    void testFindObjectById() throws IOException {
        OdooId testId = new OdooId(1);
        assertTrue(testId.exists);
        String mockResponseJson = "{\"jsonrpc\": \"2.0\",\n" +
                "  \"id\": 1, \"result\": [{\"name\":\"Test Project\"}]}";

        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        Project project = odooClient.findObjectById(testId, Project.class);

        assertNotNull(project);
        assertEquals("Test Project", project.getName());

        mockResponseJson = "{\"jsonrpc\": \"2.0\",\n" +
                "  \"id\": 1, \"result\": []}";

        when(mockResponse.body().string()).thenReturn(mockResponseJson);
        project = odooClient.findObjectById(testId, Project.class);
        assertNull(project);

        mockResponseJson = "{\"jsonrpc\": \"2.0\",\n" +
                "  \"id\": 1, \"result\": [{\"name\":\"Test Project\"}, {\"name\":\"Test Project 2\"}]}";

        when(mockResponse.body().string()).thenReturn(mockResponseJson);
        assertThrows(FetchException.class, () -> odooClient.findObjectById(testId, Project.class));

    }

    @Test
    void testFindObjectByUnknownId() throws IOException {
        OdooId testId = new OdooId(1);
        assertTrue(testId.exists);
        String mockResponseJson = "{\"jsonrpc\": \"2.0\",\n" +
                "  \"id\": 1, \"result\": [{\"name\":\"Test Project\"}]}";

        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        Project project = odooClient.findObjectById(testId, Project.class);

        assertNotNull(project);
        assertEquals("Test Project", project.getName());
    }

    @Test
    void testFindListByIds() throws IOException {
        List<OdooId> testIds = List.of(new OdooId(1, ""), new OdooId(2, "true"));

        String mockResponseJson = "{\"jsonrpc\": \"2.0\",\n" +
                "  \"id\": 1, \"result\": [{\"name\":\"Project A\"}, {\"name\":\"Project B\"}]}";
        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        List<Project> projects = odooClient.findListByIds(testIds, Project.class);

        assertNotNull(projects);
        assertEquals(2, projects.size());
        assertEquals("Project A", projects.get(0).getName());
        assertEquals("Project B", projects.get(1).getName());
    }

    @Test
    void testGenericCallValidResponse() throws IOException {
        String mockResponseJson = "{\"result\":[{\"name\":\"Project X\"}]}";

        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        List<Project> projects = odooClient.genericCall(10, 0, Project.class, "search_read", "id", ">", "10");

        assertNotNull(projects);
        assertEquals(1, projects.size());
        assertEquals("Project X", projects.get(0).getName());
    }

    @Test
    void testCreateOdooObject() throws IOException {
        String mockResponseJson = "{\"result\": 10}";
        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        Project p = new Project();
        p.setId(10);
        p.setDisplayName("Test Project");

        int createdProject = odooClient.createOdooObject(p);

        assertEquals(10, createdProject);
        final String expected = Files.readString(Path.of("src/test/resources/createProjectTest.json"));
        final String result = sentRequests.pop();
        assertEquals(expected.substring(0, expected.lastIndexOf("id")), result.substring(0, result.lastIndexOf("id")));

    }

    @Test
    void testUpdateOdooObject() throws IOException {
        String mockResponseJson = "{\"result\": 10}";

        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        Project p = new Project();
        p.setId(10);
        p.setDisplayName("Update Project");
        
        int updatedProject = odooClient.updateOdooObject(p, 10);

        assertEquals(10, updatedProject);
        final String expected = Files.readString(Path.of("src/test/resources/updateProjectTest.json"));
        final String result = sentRequests.pop();
        assertEquals(expected.substring(0, expected.lastIndexOf("id")), result.substring(0, result.lastIndexOf("id")));
    }

    @Test
    void testDeleteOdooObject() throws IOException {
        String mockResponseJson = "{\"result\": 10}";

        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        int deletedProject = odooClient.deleteOdooObject(10, Project.class);

        assertEquals(10, deletedProject);
        final String expected = Files.readString(Path.of("src/test/resources/deleteProjectTest.json"));
        final String result = sentRequests.pop();
        assertEquals(expected.substring(0, expected.lastIndexOf("id")), result.substring(0, result.lastIndexOf("id")));
    }
}
