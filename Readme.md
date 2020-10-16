Demo to reproduce https://github.com/springdoc/springdoc-openapi/issues/902

## Steps to reproduce

```bash
mvn spring-boot:run
```

Open http://localhost:8080/swagger-ui/index.html?configUrl=/api-docs/v3/swagger-config

See that "content tree item" contains "position".
