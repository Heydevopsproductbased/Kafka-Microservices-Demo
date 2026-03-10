Kafka Microservices Project:
**Event-Driven Spring Boot Microservices with Docker Compose**  
Producer → Kafka → Consumer → MySQL | Windows-Compatible | Production Ready

## 🏗️ **Architecture**

┌──────────────────────────────┐
│ REST Client │
│ (Postman / Curl / Frontend) │
└───────────────┬──────────────┘
│ HTTP Request
▼
┌────────────────────────────────┐
│ Producer Microservice │
│ Spring Boot + Kafka Template │
└───────────────┬────────────────┘
│ Publishes message
▼
┌────────────────────────────────────┐
│ Kafka Broker │
│ (Topic: demo-topic, Partitions) │
└───────────────┬────────────────────┘
│ Message pulled
▼
┌────────────────────────────────────┐
│ Consumer Microservice │
│ Spring Boot + @KafkaListener │
└───────────────┬────────────────────┘
│ Optional persistence
▼
┌────────────────────────────────────┐
│ Database │
│ MySQL / MariaDB (optional) │
└────────────────────────────────────┘
                    

