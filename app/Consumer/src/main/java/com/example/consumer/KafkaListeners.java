package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListeners {

    private final MessageRepository repository;

    public KafkaListeners(MessageRepository repository) {
        this.repository = repository;
    }

    @KafkaListener(topics = "demo-topic")
    public void listen(String message) {
        System.out.println("Received message: " + message);

        repository.save(new MessageEntity(message));
    }
}
