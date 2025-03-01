# Spring Boot Microservice with RabbitMQ and FeignClient

This project demonstrates a simple Spring Boot microservice architecture using RabbitMQ for messaging and FeignClient for inter-service communication.

## Project Overview

- **Spring Boot**: The core framework used for creating microservices.
- **RabbitMQ**: A messaging broker that facilitates asynchronous communication between microservices.
- **FeignClient**: A declarative HTTP client for calling REST APIs in other microservices.

## Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- Java 11 or higher
- Maven or Gradle (Maven used in this project)
- RabbitMQ server (either local or remote)
- Spring Boot
- IDE (Eclipse, IntelliJ IDEA, etc.)

## Setting Up RabbitMQ

1. **Install RabbitMQ** (if not already installed):
   - You can download and install RabbitMQ from the official [RabbitMQ website](https://www.rabbitmq.com/download.html).
   - Alternatively, you can run RabbitMQ via Docker.

2. **Start RabbitMQ**:
   - After installation, start the RabbitMQ server. By default, RabbitMQ runs on `localhost:5672` and its management console can be accessed at `localhost:15672` (default credentials: `guest/guest`).

## Project Structure

- **Microservice A (Producer)**: Sends messages to a RabbitMQ exchange.
- **Microservice B (Consumer)**: Listens for messages from the RabbitMQ queue and processes them.
- **FeignClient**: Microservice B calls Microservice A using FeignClient to retrieve data.

## Steps to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/your-username/springboot-microservice-rabbitmq-feignclient.git
```

### 2. Set up Microservice A (Producer)

- Navigate to the `microservice-a/` directory.
- Ensure RabbitMQ configuration is correct in the `application.properties` file.
- Run Microservice A by executing the appropriate command for your build tool.

### 3. Set up Microservice B (Consumer)

- Navigate to the `microservice-b/` directory.
- Update the Feign client configuration to communicate with Microservice A.
- Ensure RabbitMQ configuration is correct in the `application.properties` file.
- Run Microservice B by executing the appropriate command for your build tool.

### 4. Send a Message from Producer (Microservice A)

- You can create a REST endpoint in Microservice A to send messages to RabbitMQ, which will be consumed by Microservice B.

### 5. Consume the Message in Microservice B

- Microservice B listens for messages from the RabbitMQ queue and processes them. It can also make HTTP requests to Microservice A using FeignClient.

## Conclusion

This basic setup demonstrates how to:

- Use RabbitMQ for asynchronous communication between microservices.
- Use FeignClient to enable HTTP communication between microservices.

---
