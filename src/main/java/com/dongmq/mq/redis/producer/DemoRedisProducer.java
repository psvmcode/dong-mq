package com.dongmq.mq.redis.producer;

import com.dongmq.constant.RedisConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * redis生产者demo
 *
 * @Author dongboy
 * @what time    2023/9/30 14:16
 */
@Slf4j
@Component
public class DemoRedisProducer {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void send(String message) {
        log.info("redis mq send message : {}", message);
        redisTemplate.opsForList().leftPush(RedisConstant.DEMO_REDIS_MQ_KEY, message);
    }

}
