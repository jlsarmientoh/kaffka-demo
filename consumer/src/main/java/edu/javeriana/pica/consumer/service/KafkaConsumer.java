package edu.javeriana.pica.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "message-topic")
    public void consumeMessage(String message){
        System.out.println("Received Message: " + message);
    }

}
