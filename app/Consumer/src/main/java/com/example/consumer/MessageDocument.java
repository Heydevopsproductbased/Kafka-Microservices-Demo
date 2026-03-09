package com.example.consumer;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.time.Instant;

@Document(indexName = "messages")
public class MessageDocument {

    @Id
    private String id;

    private String content;

    private Instant timestamp;

    public MessageDocument() {}

    public MessageDocument(String content) {
        this.content = content;
        this.timestamp = Instant.now();
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
