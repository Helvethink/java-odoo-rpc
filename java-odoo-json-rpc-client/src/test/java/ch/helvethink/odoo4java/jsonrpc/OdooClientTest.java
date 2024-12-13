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
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class OdooClientTest {

    private OdooClient odooClient;

    @Mock
    private OkHttpClient mockHttpClient;

    @Mock
    private Response mockResponse;

    @BeforeEach
    void setUp() throws IOException {
        MockitoAnnotations.openMocks(this);

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
        // Arrange
        OdooId testId = new OdooId(1, "");
        String mockResponseJson = "{\"jsonrpc\": \"2.0\",\n" +
                "  \"id\": 1, \"result\": [{\"name\":\"Test Project\"}]}";

        // Mock response body for specific request
        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        // Act
        Project project = odooClient.findObjectById(testId, Project.class);

        // Assert
        assertNotNull(project);
        assertEquals("Test Project", project.getName());
    }

    @Test
    void testFindListByIds() throws IOException {
        // Arrange
        List<OdooId> testIds = List.of(new OdooId(1, ""), new OdooId(2, "true"));

        String mockResponseJson = "{\"jsonrpc\": \"2.0\",\n" +
                "  \"id\": 1, \"result\": [{\"name\":\"Project A\"}, {\"name\":\"Project B\"}]}";
        // Mock response body for specific request
        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        // Act
        List<Project> projects = odooClient.findListByIds(testIds, Project.class);

        // Assert
        assertNotNull(projects);
        assertEquals(2, projects.size());
        assertEquals("Project A", projects.get(0).getName());
        assertEquals("Project B", projects.get(1).getName());
    }
//
//    @Test
//    void testGenericCallHandlesExceptions() {
//        // Arrange
//        when(mockResponse.body())
//        // Act and Assert
//        FetchException exception = assertThrows(FetchException.class, () ->
//                odooClient.genericCall(0, Project.class, "method", "param1", "param2")
//        );
//
//        assertEquals("No result or something went terribly wrong", exception.getMessage());
//    }

    @Test
    void testGenericCallValidResponse() throws IOException {
        // Arrange
        String mockResponseJson = "{\"result\":[{\"name\":\"Project X\"}]}";

        // Mock response body for generic call
        when(mockResponse.body().string()).thenReturn(mockResponseJson);

        // Act
        List<Project> projects = odooClient.genericCall(10, Project.class, "search_read", "param1", "param2");

        // Assert
        assertNotNull(projects);
        assertEquals(1, projects.size());
        assertEquals("Project X", projects.get(0).getName());
    }
}
