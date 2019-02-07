package com.demo.spring.producer.send;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * 发送消息服务
 */
public interface SendService {
    @Output("myInput")
    SubscribableChannel sendOrder();
}
