# GNS3OAuth2ClientDemo
Spring Security OAuth2 Client with RestClient for GNS3

```sh
mvn clean install
set -a; GNS3_SERVER=http://127.0.0.1:3080; GNS3_USERNAME=admin; GNS3_PASSWORD=admin; set +a; mvn spring-boot:run
```

```sh
curl -k localhost:8080/v0/projects
```

