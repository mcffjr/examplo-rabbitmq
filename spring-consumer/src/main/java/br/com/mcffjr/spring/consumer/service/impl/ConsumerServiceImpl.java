package br.com.mcffjr.spring.consumer.service.impl;

import br.com.mcffjr.spring.consumer.dto.MessageDto;
import br.com.mcffjr.spring.consumer.service.IConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements IConsumerService {

    @Override
    public void action(MessageDto messageDto){
        System.err.println(messageDto.getText());
    }

}
