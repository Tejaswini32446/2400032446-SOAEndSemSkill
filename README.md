# Round Robin Load Balancing Using Spring Boot Microservices

## Project Overview

This project demonstrates a microservices-based architecture using Spring Boot, Netflix Eureka Service Discovery, and Spring Cloud API Gateway.

It implements load balancing to distribute incoming client requests among service instances, improving scalability, availability, and reliability.

## Technologies Used

- Java 17
- Spring Boot
- Spring Cloud Gateway
- Netflix Eureka
- Spring Cloud LoadBalancer
- Maven
- REST APIs
- Postman
- Git and GitHub

## Project Architecture

The project consists of three microservices:

### 1. Discovery Server
- Provides service registration and discovery.
- Maintains the registry of available microservices.
- Uses Netflix Eureka.

### 2. Driver Service
- Provides driver-related REST APIs.
- Registers itself with the Eureka Discovery Server.
- Handles incoming driver requests.

### 3. API Gateway
- Acts as the single entry point for client requests.
- Routes requests to the appropriate microservice.
- Integrates with Eureka and Spring Cloud LoadBalancer.

## Project Structure

```text
RoundRobinLoadBalancing/
│
├── ApiGateway/
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
│
├── DiscoveryServer/
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
│
└── DriverService/
    ├── src/main/java/
    ├── src/main/resources/
    └── pom.xml
```

## Configuration

| Service | Port |
|---|---:|
| Discovery Server | 8761 |
| API Gateway | 8080 |
| Driver Service | 8081 |

## How to Run the Project

Start the services in the following order:

1. Run the Discovery Server.
2. Run the Driver Service.
3. Run the API Gateway.

Make sure all services are registered successfully with Eureka.

## Testing

Use Postman to test the REST APIs through the API Gateway.

Example Gateway URLs:

- `http://localhost:8080/drivers/`
- `http://localhost:8080/status`
- `http://localhost:8080/welcome`

The actual endpoint paths and HTTP methods depend on the Driver Service controller configuration.

## Expected Outcome

- Successful registration of microservices with Eureka.
- Centralized request routing through API Gateway.
- Load balancing support through Spring Cloud LoadBalancer.
- Improved scalability through a microservices architecture.

## Author

**Tejaswini**

GitHub: [Tejaswini32446](https://github.com/Tejaswini32446)

## Conclusion

This project demonstrates service discovery, API Gateway routing, and load balancing in a Spring Boot microservices architecture.
