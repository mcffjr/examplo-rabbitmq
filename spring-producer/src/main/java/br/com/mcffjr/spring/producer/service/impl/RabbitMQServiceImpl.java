package br.com.mcffjr.spring.producer.service.impl;

import br.com.mcffjr.spring.producer.amqp.IAmqpProducer;
import br.com.mcffjr.spring.producer.dto.MessageDto;
import br.com.mcffjr.spring.producer.service.IAmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl  implements IAmqpService {

    @Autowired
    private IAmqpProducer<MessageDto> amqp;

    @Override
    public void sendToConsumer(MessageDto messageDto) {
        amqp.producer(messageDto);
    }

}
