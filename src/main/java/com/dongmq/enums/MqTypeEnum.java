package com.dongmq.enums;

import java.util.Arrays;

/**
 * mq类型枚举
 *
 * @Author dongboy
 * @what time    2023/9/28 16:23
 */
public enum MqTypeEnum {

    // rabbitmq
    RABBITMQ("RABBITMQ"),
    // rocketmq
    ROCKETMQ("ROCKETMQ"),
    // kafka
    KAFKA("KAFKA"),
    // unknown
    UNKNOWN("UNKNOWN");

    private String mqType;

    MqTypeEnum(String mqType) {
        this.mqType = mqType;
    }

    /**
     * 遍历枚举
     */
    public static MqTypeEnum getByMqType(String mqType) {
        return Arrays.stream(values()).filter(e -> e.mqType.equals(mqType)).findFirst().orElse(null);
    }

}
