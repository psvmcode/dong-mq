package com.dongmq;

import com.dongmq.mq.rabbitmq.producer.DemoRabbitmqProducer;
import com.dongmq.mq.redis.producer.DemoRedisProducer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DongMqApplicationTests {

    @Resource
    private DemoRabbitmqProducer rabbitmqProducer;

    @Resource
    private DemoRedisProducer redisProducer;

    @Test
    void contextLoads() {
    }

    @Test
    void testDemoRabbitmq() {
        rabbitmqProducer.send("hello");
    }

    @Test
    void testDemoRedisMQ() {
        redisProducer.send("hello dong");
    }

}
