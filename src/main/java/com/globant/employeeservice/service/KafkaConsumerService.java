/*package com.globant.employeeservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    //@KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    @KafkaListener(topics = "employee-management-topic", groupId = "employee-management-group")
    public void listen(String message) {
        System.out.println("Received Kafka message: " + message);
    }
}

*/