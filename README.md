kafka-Microservice-Demo/
├── app/
│   ├── Producer/               # Spring Boot Kafka Producer
│   ├── Consumer/               # Spring Boot Kafka Consumer
│
├── infra/
│   ├── Kafka/                  # Kafka manifests (if using KRaft/K8s later)
│   ├── Kafka-KRaft/            # Optional KRaft mode configs
│
├── docker-compose.yml          # Kafka + Zookeeper + Microservices
├── README.md
└── .gitignore
