package com.dongmq.mq.rabbitmq.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author lidong14@kuaishou.com
 * Created on 2023-08-13
 */
@Slf4j
@Component
@RabbitListener(queues = "demo_rabbitmq_queue")
public class DemoRabbitmqListener {

    @RabbitHandler
    public void listener(String message) {
        log.info("rabbitmq receiver message : {}", message);
    }

}
