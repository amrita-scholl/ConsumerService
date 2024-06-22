package org.consumer.consumerservice.controller;

import org.consumer.consumerservice.config.KafkaConsumerConfig;
import org.consumer.consumerservice.listener.KafkaMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerServiceCotroller {

    @Autowired
    private KafkaMessageListener kafkaMessageListener;

    @GetMapping("/consume-messages")
    public String startConsumingMessages() {
        return "Started consuming messages from Kafka topic.";
    }

}
