kafka-Microservice-Demo/
├── app/
│   ├── Producer/               # Spring Boot Kafka Producer
│   ├── Consumer/               # Spring Boot Kafka Consumer
│
├── infra/
│   ├── Kafka/                  # Kafka manifests (if using KRaft/K8s later)<img width="778" height="86" alt="Producer_messagesent" src="https://github.com/user-attachments/assets/1a738327-1780-4ef1-9cfc-cfb9fb4bd113" />

│   ├── Kafka-KRaft/            # Optional KRaft mode configs
│
├── docker-compose.yml          # Kafka + Zookeeper + Microservices
├── README.md
└── .gitignore

                          ┌──────────────────────────────┐
                          │        REST Client            │
                          │ (Postman / Curl / Frontend)   │
                          └───────────────┬──────────────┘
                                          │  HTTP Request
                                          ▼
                          ┌────────────────────────────────┐
                          │      Producer Microservice      │
                          │  Spring Boot + Kafka Template   │
                          └───────────────┬────────────────┘
                                          │  Publishes message
                                          ▼
                         ┌────────────────────────────────────┐
                         │            Kafka Broker             │
                         │   (Topic: demo-topic, Partitions)  │
                         └───────────────┬────────────────────┘
                                         │  Message pulled
                                         ▼
                         ┌────────────────────────────────────┐
                         │      Consumer Microservice          │
                         │ Spring Boot + @KafkaListener        │
                         └───────────────┬────────────────────┘
                                         │  Optional persistence
                                         ▼
                         ┌────────────────────────────────────┐
                         │              Database               │
                         │      MySQL / MariaDB (optional)    │
                         └────────────────────────────────────┘


                          ┌──────────────────────────────┐
                          │        REST Client            │
                          │ (Postman / Curl / Frontend)   │
                          └───────────────┬──────────────┘
                                          │  HTTP Request
                                          ▼
                          ┌────────────────────────────────┐
                          │      Producer Microservice      │
                          │  Spring Boot + Kafka Template   │
                          └───────────────┬────────────────┘
                                          │  Publishes message
                                          ▼
                         ┌────────────────────────────────────┐
                         │            Kafka Broker             │
                         │   (Topic: demo-topic, Partitions)  │
                         └───────────────┬────────────────────┘
                                         │  Message pulled
                                         ▼
                         ┌────────────────────────────────────┐
                         │      Consumer Microservice          │
                         │ Spring Boot + @KafkaListener        │
                         └───────────────┬────────────────────┘
                                         │  Optional persistence
                                         ▼
                         ┌────────────────────────────────────┐
                         │              Database               │
                         │      MySQL / MariaDB (optional)    │
                         └────────────────────────────────────┘
                          ┌──────────────────────────────┐
                          │        REST Client            │
                          │ (Postman / Curl / Frontend)   │
                          └───────────────┬──────────────┘
                                          │  HTTP Request
                                          ▼
                          ┌────────────────────────────────┐
                          │      Producer Microservice      │
                          │  Spring Boot + Kafka Template   │
                          └───────────────┬────────────────┘
                                          │  Publishes message
                                          ▼
                         ┌────────────────────────────────────┐
                         │            Kafka Broker             │
                         │   (Topic: demo-topic, Partitions)  │
                         └───────────────┬────────────────────┘
                                         │  Message pulled
                                         ▼
                         ┌────────────────────────────────────┐
                         │      Consumer Microservice          │
                         │ Spring Boot + @KafkaListener        │
                         └───────────────┬────────────────────┘
                                         │  Optional persistence
                                         ▼
                         ┌────────────────────────────────────┐
                         │              Database               │
                         │      MySQL / MariaDB (optional)    │
                         └────────────────────────────────────┘

