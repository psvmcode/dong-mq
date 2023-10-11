package com.dongmq.config;

import com.dongmq.constant.RabbitmqConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rabbitmq配置类
 *
 * @author lidong14@kuaishou.com
 * Created on 2023-08-13
 */
@Slf4j
@Configuration
public class RabbitmqConfig {

    // 声明队列
    @Bean
    public Queue DemoQueue() {
        log.info("create rabbitmq queue : {}", RabbitmqConstant.DEMO_RABBITMQ_QUEUE);
        return new Queue(RabbitmqConstant.DEMO_RABBITMQ_QUEUE, true);
    }

    // 声明交换机
    @Bean
    public DirectExchange DemoExchange() {
        log.info("create rabbitmq exchange : {}", RabbitmqConstant.DEMO_RABBITMQ_EXCHANGE);
        return ExchangeBuilder.directExchange(RabbitmqConstant.DEMO_RABBITMQ_EXCHANGE).durable(true).build();
    }

    // 绑定队列和交换机
    @Bean
    public Binding DemoBinding() {
        log.info("binding rabbitmq queue and exchange : {},{}"
                , RabbitmqConstant.DEMO_RABBITMQ_QUEUE,
                RabbitmqConstant.DEMO_RABBITMQ_EXCHANGE);
        return BindingBuilder.bind(DemoQueue()).to(DemoExchange()).with("test");
    }

}
