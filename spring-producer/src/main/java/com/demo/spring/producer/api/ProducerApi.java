package com.demo.spring.producer.api;

import com.demo.spring.producer.send.SendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProducerApi
 *
 * @author 10905 2019/2/7
 * @version 1.0
 */
@RestController
public class ProducerApi {
    @Autowired
    SendService sendService;
    @RequestMapping(value = "/sendRequest",method = RequestMethod.GET)
    public String sendRequest(){
//        创建消息
        Message message = MessageBuilder.withPayload("hello world 我是mq".getBytes()).build();
//        发送消息
        sendService.sendOrder().send(message);
        System.out.println("发送消息: "+message);
        return "success!";
    }
}
