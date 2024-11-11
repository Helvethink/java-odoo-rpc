# java-odoo-xml-rpc-core

## Description

`java-odoo-xml-rpc-core` is a Maven module that provides the core functionalities for XML-RPC communication with the
Odoo ERP system. \
The [OdooClient](/src/main/java/ch/helvethink/odoo4java/xmlrpc/OdooClient.java) class helps to serialize Odoo's responses into Java objects.

## Setup Instructions

To add `java-odoo-xml-rpc-core` to your project, add the following to your `pom.xml`:

```xml

<dependency>
    <groupId>ch.helvethink.odoo4java</groupId>
    <artifactId>java-odoo-xml-rpc-core</artifactId>
    <version>${odoo4java.version}</version>
</dependency>
```

## Basic Usage

```java
public static void main(String[] args) throws MalformedURLException, XmlRpcException {
    // Initialize an OdooClient to fetch answers
    OdooClient cli = new OdooClient(ODOO_URL, DBNAME, USERNAME, PASSWORD, true);
    LOG.info(cli.getVersion()); // The version of your Odoo instance

    OdooId idToFetch = new OdooId();
    idToFetch.id = 2;
    // Fetch a single Object by Odoo ID
    Project project = cli.fetchObjectById("project.project", idToFetch, Project.class);
    LOG.info(project.getDisplayName()); // The project's display name attribute

    OdooId id2fetch = new OdooId();
    id2fetch.id = 3;

    // Fetch multiple objects by Odoo ID
    List<Project> projects = cli.fetchListByIds("project.project", Arrays.asList(idToFetch, id2fetch), Project.class);
    LOG.info(projects.stream().map(pt -> pt.getDisplayName()).collect(Collectors.joining(",")));
    
    // Fetch relationships for an odoo object, not recursively
    cli.fetchRelationShips(project, Arrays.asList(ProjectTask.class, ResUsers.class));
    System.out.println("1) " + cli.findByCriteria(1, Project.class, "name", "=", "Sample Project").stream().map(a -> a.getName()).collect(Collectors.joining(",")));
    System.out.println("2) " + cli.findByCriteria(1, Project.class, "name", "like", "%Sample%").stream().map(a -> a.getName()).collect(Collectors.joining(",")));
    System.out.println("3) " + cli.findByCriteria(1, Project.class).stream().map(a -> a.getName()).collect(Collectors.joining(",")));
    System.out.println("4) " + cli.findByCriteria(1, Project.class, "id", "=", "1").stream().map(a -> a.getName()).collect(Collectors.joining(",")));
    
    // Find a list of objects using search criteria, with a limit specified - the first parameter, here 1. 
    // If no criteria is specified then everything will be fetched.
    List<TimesheetsAnalysisReport> timesheet = cli.findByCriteria(1, TimesheetsAnalysisReport.class);
    System.out.println("5) " + timesheet.stream().map(a -> a.getName()).collect(Collectors.joining(",")));

    // If 0, then will fetch all objects.
    List<TimesheetsAnalysisReport> ts = cli.findByCriteria(0, TimesheetsAnalysisReport.class);
    System.out.println("6) " + ts.stream().map(a -> a.getName()).collect(Collectors.joining(",")));

    // Fetch recursively with depth = 2 
    cli.fetchRecursivelyRelationShips(ts.get(ts.size() - 1), 2, Collections.emptyList());

    System.out.println(ts.get(ts.size() - 1).getCompanyIdAsObject());
    System.out.println(ts.get(ts.size() - 1).getCompanyIdAsObject().getName());
    System.out.println(ts.get(ts.size() - 1).getCompanyIdAsObject().getCurrencyIdAsObject().getDisplayName());

    // Fetch using the criterion name like %Sample%
    List<Project> sampleProjects = cli.findByCriteria(1, Project.class, "name", "like", "%Sample%");
    // LOG.info("1) {}", sampleProjects.stream().map(a -> a.name).collect(Collectors.joining(",")));
    cli.fetchRelationShips(sampleProjects.get(0), Collections.emptyList());
    System.out.println(sampleProjects.get(0).getTasksAsList().get(0));
}
```