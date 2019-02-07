package com.demo.spring.consumer.receive;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 消费消息
 */
public interface ReceiveService {
    @Input("myInput")
    SubscribableChannel myInput();
}
