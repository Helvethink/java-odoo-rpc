# java-odoo-json-rpc-client

## Description

`java-odoo-json-rpc-client` is a Maven module that provides the core functionalities for JSON-RPC communication with the
Odoo ERP system. \
The [OdooClient](/java-odoo-json-rpc-client/src/main/java/ch/helvethink/odoo4java/jsonrpc/OdooClient.java) class helps to serialize Odoo's responses into Java objects.
It also supports provides us abstraction for creation, update and deletion of an Odoo Object.

## Setup Instructions

To add `java-odoo-json-rpc-client` to your project, add the following to your `pom.xml`:

```xml

<dependency>
    <groupId>ch.helvethink.odoo4java</groupId>
    <artifactId>java-odoo-json-rpc-client</artifactId>
    <version>${odoo4java.version}</version>
</dependency>
```

## Basic Usage

Here's a sample class with methods we used frequently from OdooClient:

```java
package ch.helvethink.odoo.sample;

import ch.helvethink.odoo.models.project.Project;
import ch.helvethink.odoo.models.project.ProjectTask;
import ch.helvethink.odoo.models.res.ResCompany;
import ch.helvethink.odoo.models.res.ResPartner;
import ch.helvethink.odoo.models.res.ResUsers;
import ch.helvethink.odoo.models.timesheets.analysis.TimesheetsAnalysisReport;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.xmlrpc.OdooClient;
import org.apache.xmlrpc.XmlRpcException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OdooClientSampleUsage {


    public static final String USERNAME = System.getenv("username");
    public static final String DBNAME = System.getenv("dbname");
    public static final String PASSWORD = System.getenv("password");
    public static final String ODOO_URL = System.getenv("url");

    private static final Logger LOG = LoggerFactory.getLogger(OdooClientSampleUsage.class);

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        // Initialize an OdooClient to fetch answers

        OdooClient cli = new OdooClient(ODOO_URL, DBNAME, USERNAME, PASSWORD, true);
        OdooObjectLoader loader = new OdooObjectLoader(cli);

        LOG.info(cli.getVersion());

        OdooId idToFetch = new OdooId();
        idToFetch.id = 2;

        // Fetch a single Object by Odoo ID
        Project project = cli.findObjectById("project.project", idToFetch, Project.class);
        LOG.info(project.getDisplayName());

        OdooId id2fetch = new OdooId();
        id2fetch.id = 3;
        // Fetch multiple objects by Odoo IDs
        List<Project> projects = cli.findListByIds("project.project", Arrays.asList(idToFetch, id2fetch), Project.class);
        LOG.info(projects.stream().map(pt -> pt.getDisplayName()).collect(Collectors.joining(",")));

        // Fetch relationships for an odoo object, not recursively, filtering classes we want to fetch

        loader.fetchRelationShips(project, Arrays.asList(ProjectTask.class, ResUsers.class));

        LOG.info("1) Find by criteria 'equals' - {}", cli.findByCriteria(1, Project.class, "name", "=", "Sample Project").stream().map(a -> a.getName()).collect(Collectors.joining(",")));
        LOG.info("2) Find by criteria 'like' - {}", cli.findByCriteria(1, Project.class, "name", "like", "%Sample%").stream().map(a -> a.getName()).collect(Collectors.joining(",")));
        LOG.info("3) Find by criteria limit 1 without criterion - {}", cli.findByCriteria(1, Project.class).stream().map(a -> a.getName()).collect(Collectors.joining(",")));
        LOG.info("4) Find by criteria id equals - {}", cli.findByCriteria(1, Project.class, "id", "=", "1").stream().map(a -> a.getName()).collect(Collectors.joining(",")));


        // Find a list of objects using search criteria, with a limit specified - the first parameter, here 1. 
        // If no criteria is specified then everything will be fetched.
        List<TimesheetsAnalysisReport> timesheet = cli.findByCriteria(1, TimesheetsAnalysisReport.class);
        LOG.info("5) Find by criteria limit 1 without criterion - {}", timesheet.stream().map(a -> a.getName()).collect(Collectors.joining(",")));

        // If 0, then will fetch all objects.
        List<TimesheetsAnalysisReport> ts = cli.findByCriteria(0, TimesheetsAnalysisReport.class);
        LOG.info("6) Find by criteria no limit without criterion - {}", ts.stream().map(a -> a.getName()).collect(Collectors.joining(",")));

        // Fetch recursively with depth = 2
        loader.fetchRecursivelyRelationShips(ts.getLast(), 2, Collections.emptyList());
        // Check that we fetched Currency Too
        LOG.info(ts.getLast().getCompanyIdAsObject().getName());
        LOG.info(ts.getLast().getCompanyIdAsObject().getCurrencyIdAsObject().getDisplayName());

        // Fetch using the criterion name like %Sample%
        List<Project> sampleProjects = cli.findByCriteria(1, Project.class, "name", "like", "%Sample%");
        loader.fetchRelationShips(sampleProjects.getFirst(), Collections.emptyList());
        LOG.info(sampleProjects.getFirst().getTasksAsList().get(0).getDisplayName());

        // Find by names
        cli.findByNames(ProjectTask.class, Collections.singletonList("Sample Project Task 1"));
        cli.findByNames(ProjectTask.class, Arrays.asList("Sample Project Task 1", "Sample Project Task 1"));

    }
}
```

N.B: Model classes have been generated using the java-odoo-xml-rpc-plugin:

```xml
<plugin>
                <groupId>ch.helvethink.odoo4java</groupId>
                <artifactId>java-odoo-xml-rpc-plugin</artifactId>
                <version>${odoo4java.version}</version>
                <configuration>
                    <generatedClassesRootPackage>ch.helvethink.odoo.models</generatedClassesRootPackage>
                    <generatedClassPath>target/generated-sources</generatedClassPath>
                    <odooDatabase>ANGRY_MARMOT_ODOO_DB</odooDatabase>
                    <odooUsername>ANGRY_MARMOT_USERNAME</odooUsername>
                    <odooInstanceUrl>https://ANGRY_MARMOT_ODOO_URL</odooInstanceUrl>
                    <odooPassword>ANGRY_MARMOT_PASS</odooPassword>
                    <includedPrefixes>
                        <include>account</include>
                        <include>project</include>
                        <include>res</include>
                        <include>timesheets</include>
                    </includedPrefixes>
                </configuration>
                <executions>
                    <execution>
                        <id>generate-sources</id>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <phase>generate-sources</phase>
                    </execution>
                </executions>
            </plugin>
```