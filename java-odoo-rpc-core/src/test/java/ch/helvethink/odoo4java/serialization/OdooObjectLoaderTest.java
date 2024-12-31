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
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.project.Project;
import ch.helvethink.odoo4java.models.project.ProjectTask;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.rpc.OdooObjectLoader;
import ch.helvethink.odoo4java.rpc.OdooRpcClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class OdooObjectLoaderTest {

    private ProjectTask projectTask;

    private OdooObjectLoader odooLoader;

    private OdooRpcClient fetcher;

    @BeforeEach
    public void setUp() {
        projectTask = new ProjectTask();
        fetcher = mock(OdooRpcClient.class);
        odooLoader = new OdooObjectLoader(fetcher);
    }

    @Test
    void testFetchRelationShips() {
        // Mocking the dependencies
        final Project project = mock(Project.class);
        final OdooId projectId = new OdooId();
        projectTask.setProjectId(projectId); // Setting the OdooId for the relation

        // Mocking findObjectById method
        when(fetcher.findObjectById(projectId, Project.class)).thenReturn(project);

        final List<Class<? extends OdooObj>> allClasses = getAllClassesInPackage("ch.helvethink.odoo").stream().toList();

        // Calling the method
        odooLoader.fetchRelationShips(projectTask, allClasses);

        // Asserting that the associated field has been populated
        assertEquals(project, projectTask.getProjectIdAsObject());
    }

    @Test
    void testFetchRecRelationShips() {
        // Mocking dependencies
        final List<ResPartner> resPartnersList = Arrays.asList(new ResPartner(), new ResPartner());
        projectTask.setMessagePartnerIds(Arrays.asList(1, 2)); // Set attachment_ids to simulate OdooId list

        // Mocking fetchListByIdsInt method
        when(fetcher.findListByIdsInt(anyList(), eq(ResPartner.class))).thenReturn(resPartnersList);

        // Calling the method
        odooLoader.fetchRecursivelyRelationShips(projectTask, 1, getAllClassesInPackage("ch.helvethink.odoo").stream().toList());

        // Asserting that the list field has been populated
            assertEquals(resPartnersList, projectTask.getMessagePartnerIdsAsList());
    }

    static Set<Class<? extends OdooObj>> getAllClassesInPackage(final String packageName) {
        final Reflections reflections = new Reflections(packageName, new TypeAnnotationsScanner());
        return reflections.getSubTypesOf(OdooObj.class);
    }

}
