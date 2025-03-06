# Testing Policy

## Overview
Ensuring high code quality and reliability is a key objective for `java-odoo-rpc`. All new functionality must include adequate test coverage to maintain the stability and maintainability of the project.

## Code Coverage Requirement
- Each new functionality must have **at least 70% code coverage**.
- Code coverage is measured using **JaCoCo** or an equivalent tool.
- The coverage includes **unit tests** and, where applicable, **integration tests**.

## Testing Guidelines
- Write **unit tests** for all critical logic and edge cases.
- Use **mocking frameworks** like Mockito where necessary to isolate components.
- Prefer **integration tests** for features that interact with external systems (e.g., Odoo API).
- Ensure that tests are **repeatable** and do not depend on external factors.

## Running Tests & Coverage Reports
To check test coverage locally, run:
```sh
mvn clean test jacoco:report
```
After running tests, the coverage report can be found in:
```
target/site/jacoco/index.html
```

## CI/CD Enforcement
- Pull requests will be blocked if code coverage **falls below 70%**.
- CodeClimate or another automated coverage tool will verify compliance.
- Any reduction in overall project coverage must be justified and approved.

## Exceptions
- Minor bug fixes that do not introduce new logic may be exempted.
- Documentation changes and refactoring (without logic changes) are not subject to coverage requirements.

By adhering to this policy, we ensure the reliability and maintainability of `java-odoo-rpc`. Thank you for following these guidelines!
