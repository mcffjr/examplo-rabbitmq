package br.com.mcffjr.spring.producer.controller;

import br.com.mcffjr.spring.producer.dto.MessageDto;
import br.com.mcffjr.spring.producer.service.impl.RabbitMQServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/amqp")
public class AmqpController {

    @Autowired
    private RabbitMQServiceImpl service;

    @PostMapping("/send")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendToConsumer(@RequestBody MessageDto messageDto){
        service.sendToConsumer(messageDto);
    }

}
