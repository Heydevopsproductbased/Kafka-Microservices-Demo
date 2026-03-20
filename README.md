Event‑Driven Microservices on Kubernetes with Kafka, KEDA, and Full Observability
A production‑grade event‑driven architecture built with Apache Kafka, Kubernetes, and GitOps. This project demonstrates how to design, deploy, scale, and observe microservices communicating through Kafka topics, using modern cloud‑native tooling such as Strimzi, ArgoCD, Prometheus, Grafana, Jaeger, and KEDA.

The goal is to showcase real‑world DevOps/SRE capabilities: infrastructure automation, GitOps workflows, event‑driven autoscaling, distributed tracing, and operational visibility.

📌 Project Overview
This repository contains:

A Kafka cluster deployed on Kubernetes using the Strimzi operator

Producer and consumer microservices (Python/Go)

GitOps deployment using ArgoCD

Observability stack with Prometheus, Grafana, and Jaeger

Event‑driven autoscaling using KEDA based on Kafka lag

Load testing and dashboards for throughput, latency, and consumer lag

The system simulates a real event‑driven pipeline (e.g., order processing), where producers publish messages to Kafka topics and consumers process them at scale.

🧱 Architecture
The architecture includes:

Strimzi Kafka Operator managing Kafka brokers, Zookeeper, topics, and users

Producer service generating events (orders, messages, telemetry)

Consumer service processing events and writing results to logs or a database

KEDA scaling consumers based on Kafka lag

Prometheus Operator scraping Kafka, KEDA, and app metrics

Grafana dashboards visualizing throughput, lag, and autoscaling

Jaeger tracing producer → Kafka → consumer flows

ArgoCD managing all deployments via GitOps

High‑level flow:
Producer → Kafka Topic → Consumer → Metrics/Tracing → Dashboards

📁 Repository Structure
kafka-microservices/
│
├── infra/
│   ├── strimzi/
│   ├── keda/
│   ├── prometheus-grafana/
│   └── jaeger/
│
├── app/
│   ├── producer/
│   └── consumer/
│
├── gitops/
│   ├── applications/
│   └── kustomize/
│
└── docs/
    ├── architecture.png
    ├── dashboards.png
    └── README.md

🚀 Getting Started
Prerequisites
Kubernetes cluster (Minikube, KinD, EKS, AKS)

kubectl installed and configured

Helm installed

Docker for building images

📚 Future Enhancements
Add Kafka Connect with PostgreSQL sink

Add schema registry + schema evolution demo

Add chaos testing (broker failure, consumer crash)

Add distributed caching (Redis)

Add API gateway for external producers