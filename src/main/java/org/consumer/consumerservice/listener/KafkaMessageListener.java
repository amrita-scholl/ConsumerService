package org.consumer.consumerservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    @KafkaListener(topics = "<TOPIC>", groupId = "<GROUP_ID_CONFIG>")
    public void listen(String message) {
        System.out.printf("Consumed message: %s%n", message);
        // Add your processing logic here
    }
}

