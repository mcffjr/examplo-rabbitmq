package br.com.mcffjr.spring.consumer.amqp.impl;

import br.com.mcffjr.spring.consumer.amqp.IAmqpConsumer;
import br.com.mcffjr.spring.consumer.dto.MessageDto;
import br.com.mcffjr.spring.consumer.service.IConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumerImpl implements IAmqpConsumer<MessageDto> {

    @Autowired
    private IConsumerService consumerService;

    @Override
    @RabbitListener(queues="${spring.rabbitmq.request.routing-key.producer}")
    public void consumer (MessageDto messageDto) {
        try{
            consumerService.action(messageDto);
        }catch (Exception e){
            throw new AmqpRejectAndDontRequeueException(e);
        }
    }

}
