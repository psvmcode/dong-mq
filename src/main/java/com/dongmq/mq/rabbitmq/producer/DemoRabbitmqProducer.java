package com.dongmq.mq.rabbitmq.producer;

import com.dongmq.constant.RabbitmqConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lidong14@kuaishou.com
 * Created on 2023-08-13
 */
@Slf4j
@Component
public class DemoRabbitmqProducer {

    @Resource
    private RabbitTemplate rabbitTemplate;

    public void send(String message) {
        log.info("rabbitmq send message : {}", message);
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend(RabbitmqConstant.DEMO_RABBITMQ_EXCHANGE, message);
        }
    }

}
