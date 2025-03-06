# java-odoo-xml-rpc

[![Static Badge](https://img.shields.io/badge/maven%20central-0.0.6-green)](https://central.sonatype.com/artifact/ch.helvethink.odoo4java/java-odoo-rpc-parent/0.0.6)

Coverage: ![rpc-core-cov](.github/badges/rpc-core-jacoco.svg)
![xml-rpc-cov](.github/badges/xml-rpc-core-jacoco.svg)
![json-rpc-cov](.github/badges/json-rpc-client-jacoco.svg)

![OpenSSF Scorecard](https://api.securityscorecards.dev/projects/github.com/Helvethink/java-odoo-rpc/badge?style=flat)

The `Java Odoo RPC` project provides tooling and abstraction for interactions with your Odoo RPC API (JSON and XML).\
First, it provides the [java-odoo-xml-rpc-core](java-odoo-xml-rpc-core/README.MD) library which provides you some tooling for the serialization of 
objects returned by Odoo using the XML-RPC external API.\
Second, it provides you the [java-odoo-json-rpc-plugin](java-odoo-json-rpc-client/README.MD) library which provides you some tooling for the serialization of
objects returned by Odoo using the JSON-RPC external API, but also provides you some abstraction for create, update and delete operations.\
Finally, it provides you the [java-odoo-xml-rpc-plugin](java-odoo-xml-rpc-plugin/README.MD) which will help you for the generation of Java classes corresponding to Odoo Models.


## Contributing

Contributions are welcome!If you encounter any issues or have suggestions, please open an issue or submit a pull request.

## License

This plugin is licensed under the MIT License.
