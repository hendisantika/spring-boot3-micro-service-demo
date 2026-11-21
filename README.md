# spring-boot3-micro-service-demo

[![Java CI with Maven](https://github.com/hendisantika/spring-boot3-micro-service-demo/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/spring-boot3-micro-service-demo/actions/workflows/maven.yml)
![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.x-6DB33F?logo=springboot)
![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2025.1.x-6DB33F?logo=spring)

Micro services architecture demo with Spring Boot & Spring Cloud: centralized configuration, service discovery,
API gateway, OpenFeign inter-service calls, OpenAPI docs and distributed tracing.

## Tech Stack

| Component            | Version / Library                                      |
|----------------------|--------------------------------------------------------|
| Java                 | 25 (Temurin)                                           |
| Spring Boot          | 4.1.x                                                  |
| Spring Cloud         | 2025.1.x                                               |
| Config Server        | Spring Cloud Config (native profile, `classpath:/configs`) |
| Service Discovery    | Netflix Eureka                                         |
| API Gateway          | Spring Cloud Gateway Server WebFlux                    |
| Inter-service calls  | Spring Cloud OpenFeign                                 |
| API Documentation    | springdoc-openapi 3.x                                  |
| Tracing              | Micrometer Tracing (Brave) + Zipkin                    |
| Database             | PostgreSQL (school & student), H2 for tests            |
| Build                | Maven (one project per service)                        |

## Services

| Service         | Port | Description                                              |
|-----------------|------|----------------------------------------------------------|
| `config-server` | 8888 | Centralized configuration (`config-server/src/main/resources/configs`) |
| `discovery`     | 8761 | Eureka service registry                                  |
| `gateway`       | 9999 | API gateway routing to the services                      |
| `employee`      | 8081 | Employee service (`/api/v1/employee`)                    |
| `department`    | 8082 | Department service (`/api/v1/department`)                |
| `organization`  | 8083 | Organization service (`/api/v1/organization`)            |
| `school`        | 8070 | School service, calls `student` via OpenFeign (`/api/v1/schools`) |
| `student`       | 8091 | Student service (`/api/v1/students`)                     |

```
                ┌──────────────┐
  client ─────▶ │   gateway    │ :9999
                └──────┬───────┘
                       │  (routes / discovery locator)
     ┌─────────┬───────┼────────┬───────────┬──────────┐
     ▼         ▼       ▼        ▼           ▼          ▼
 employee  department organization  school ──Feign──▶ student
     │         │       │        │                      │
     └─────────┴───────┴────┬───┴──────────────────────┘
                            ▼
             discovery (Eureka :8761) + config-server (:8888)
```

## Prerequisites

- JDK 25
- Maven 3.9+ (or use the `mvnw` wrapper inside each service)
- PostgreSQL with databases `schools` and `students` (for `school` & `student`)
- Zipkin (optional) for tracing: `docker run -d -p 9411:9411 openzipkin/zipkin`

## Build

Every service is an independent Maven project:

```shell
for s in config-server discovery gateway employee department organization school student; do
  mvn -B package --file "$s/pom.xml"
done
```

Tests of `school` and `student` use an in-memory H2 database and do not need the config server, Eureka or PostgreSQL.

## Run

Start the services in this order:

```shell
cd config-server && ./mvnw spring-boot:run   # 1. configuration
cd discovery     && ./mvnw spring-boot:run   # 2. service registry
cd student       && ./mvnw spring-boot:run   # 3. business services ...
cd school        && ./mvnw spring-boot:run
cd employee      && ./mvnw spring-boot:run
cd department    && ./mvnw spring-boot:run
cd organization  && ./mvnw spring-boot:run
cd gateway       && ./mvnw spring-boot:run   # 4. API gateway
```

- Eureka dashboard: http://localhost:8761
- Swagger UI (per service): `http://localhost:<port>/swagger-ui`

## CI/CD & Dependency Updates

- **GitHub Actions** (`.github/workflows/maven.yml`): builds and tests every service in parallel (matrix) on JDK 25,
  then submits the Maven dependency graph to GitHub on pushes to `main`.
- **Dependabot** (`.github/dependabot.yml`): daily updates for Maven (all services) and GitHub Actions,
  grouped by Spring Boot, Spring Cloud, springdoc, observability, Maven plugins and other minor/patch updates.

## License

[MIT](LICENSE)
