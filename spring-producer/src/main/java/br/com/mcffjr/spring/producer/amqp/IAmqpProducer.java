package br.com.mcffjr.spring.producer.amqp;

public interface IAmqpProducer<T> {

    void producer(T t);

}
