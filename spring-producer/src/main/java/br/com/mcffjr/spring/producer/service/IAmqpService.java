package br.com.mcffjr.spring.producer.service;

import br.com.mcffjr.spring.producer.dto.MessageDto;

public interface IAmqpService {

    void sendToConsumer(MessageDto messageDto);

}
