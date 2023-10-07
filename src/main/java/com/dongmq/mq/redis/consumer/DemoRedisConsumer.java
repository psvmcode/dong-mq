package com.dongmq.mq.redis.consumer;

import com.dongmq.constant.RedisConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * redis消费者demo
 *
 * @Author dongboy
 * @what time    2023/9/30 14:19
 */
@Slf4j
@Configuration
public class DemoRedisConsumer {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Bean
    public void receiver() {
        Object object = redisTemplate.opsForList().rightPop(RedisConstant.DEMO_REDIS_MQ_KEY);
        log.info("redis mq receiver message : {}", object);
    }

}
