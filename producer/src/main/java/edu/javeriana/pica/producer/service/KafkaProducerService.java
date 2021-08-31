package edu.javeriana.pica.producer.service;

import edu.javeriana.pica.producer.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(Message message){
        kafkaTemplate.send("message-topic", message.getMessage());
    }
}
