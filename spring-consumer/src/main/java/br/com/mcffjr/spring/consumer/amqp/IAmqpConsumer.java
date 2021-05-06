package br.com.mcffjr.spring.consumer.amqp;

public interface IAmqpConsumer<T> {

    void consumer(T t) throws Exception;

}
