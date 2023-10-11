package com.dongmq.mq.rabbitmq.listener;

import com.dongmq.constant.RabbitmqConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * rabbitmq消费者demo
 *
 * @author lidong14@kuaishou.com
 * Created on 2023-08-13
 */
@Slf4j
@Component
public class DemoRabbitmqListener {

    @RabbitListener(queues = RabbitmqConstant.DEMO_RABBITMQ_QUEUE)
    public void listener(String message) {
        log.info("rabbitmq receiver message : {}", message);
    }

}
