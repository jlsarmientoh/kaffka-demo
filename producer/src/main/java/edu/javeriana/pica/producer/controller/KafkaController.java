package edu.javeriana.pica.producer.controller;

import edu.javeriana.pica.producer.model.Message;
import edu.javeriana.pica.producer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @PostMapping("publish")
    public void publishMessage(@RequestBody Message message) {
        kafkaProducerService.sendMessage(message);
    }
}
