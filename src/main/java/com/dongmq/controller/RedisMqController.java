package com.dongmq.controller;

import com.dongmq.mq.redis.producer.DemoRedisProducer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * redis模拟mq
 *
 * @Author dong boy
 * @what time    2023/9/30 17:29
 */
@Api(tags = "redis模拟mq")
@RestController
@RequestMapping(value = "/redis")
public class RedisMqController {

    @Resource
    private DemoRedisProducer redisProducer;

    @GetMapping("demo")
    @ApiOperation(value = "Redis模拟mq测试接口")
    public void demo() {
        redisProducer.send("redis mq demo");
    }

}
