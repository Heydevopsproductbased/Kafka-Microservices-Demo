package com.example.consumer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
}
