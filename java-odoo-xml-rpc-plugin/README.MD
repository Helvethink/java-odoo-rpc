# Odoo Generator Plugin

The Odoo Generator Plugin is a Maven plugin designed to generate Java classes directly from an Odoo instance.

This allows developers to quickly create Java representations of Odoo models, streamlining integration between Java applications and Odoo.

For now, this plugin uses XML-RPC API from Odoo (because of the non-maturity of the JSON-RPC API).

## Features

    Generate Java classes for Odoo models
    Connects directly to your Odoo instance
    Simplifies Odoo-Java integration

## Requirements

    Maven 3.6+
    Java 17+
    Access to an Odoo instance with the required permissions

## Installation

To use the Odoo Generator Plugin in your Maven project, add the following dependency to your pom.xml:

```xml
<build>
  <plugins>
    <plugin>
      <groupId>ch.helvethink.odoo</groupId>
      <artifactId>odoo-generator-plugin</artifactId>
      <version>0.0.1</version>
    </plugin>
  </plugins>
</build>
```

If you want to configure it in your pom for automatic generation when compiling, you can use the following:

```xml
<plugin>
                <groupId>ch.helvethink.odoo</groupId>
                <artifactId>odoo-generator-plugin</artifactId>
                <version>0.0.1</version>
                <configuration>
                    <generatedClassesRootPackage>ch.helvethink.odoo.models</generatedClassesRootPackage>
                    <generatedClassPath>target/generated-sources</generatedClassPath>
                    <odooDatabase>ODOO_DATABASE</odooDatabase>
                    <odooUsername>ODOO_USERNAME</odooUsername>
                    <odooInstanceUrl>https://YOUR_ODOO_URI</odooInstanceUrl>
                    <odooPassword>ODOO_API_KEY_OR_PASSWORD</odooPassword>

<!--                    <excludedPrefixes>-->
<!--                        <exclude>barcode</exclude>-->
<!--                        <exclude>theme</exclude>-->
<!--                    </excludedPrefixes>-->

                    <includedPrefixes>
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

N.B.: excludedPrefixes and includedPrefixes are mutually exclusive. \
If you don't add any of them, everything will be generated.

## Usage

To generate Java classes from an Odoo instance, execute the following Maven command:

```sh
mvn odoo-generator:generate -Dodoo.password=<YOUR_ODOO_PASSWORD> -Dodoo.database=<YOUR_ODOO_DB> -Dodoo.instance=<YOUR_ODOO_INSTANCE> -Dodoo.username=<YOUR_ODOO_USERNAME>
```

Replace the placeholders with the necessary details for your Odoo instance:

    <YOUR_ODOO_PASSWORD>: Password for your Odoo account
    <YOUR_ODOO_DB>: Name of the Odoo database to connect to
    <YOUR_ODOO_INSTANCE>: URL of your Odoo instance
    <YOUR_ODOO_USERNAME>: Username for your Odoo account

Example

If your Odoo credentials and instance details are as follows:

    Password: odooPass123
    Database: myOdooDB
    Instance URL: https://my-odoo-instance.com
    Username: admin

Run the command:

```sh
mvn odoo-generator:generate -Dodoo.password=odooPass123 -Dodoo.database=myOdooDB -Dodoo.instance=https://my-odoo-instance.com -Dodoo.username=admin
```

This will generate the Java classes based on the models available in your Odoo instance.

## Odoo supported versions

For now, the plugin has been successfully tested for the following versions:
<table>
<tr><th>Versions</th></tr>
<tr><td>17.0</td></tr>
<tr><td>18.0</td></tr>
</table>

