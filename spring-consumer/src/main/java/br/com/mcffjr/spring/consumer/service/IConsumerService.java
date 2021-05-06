package br.com.mcffjr.spring.consumer.service;

import br.com.mcffjr.spring.consumer.dto.MessageDto;

public interface IConsumerService {

    void action(MessageDto messageDto);

}
