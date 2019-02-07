package com.demo.spring.consumer;

import com.demo.spring.consumer.receive.ReceiveService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(ReceiveService.class)
public class ConsumerApp3 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp3.class, args);
        System.out.println("消息消费者8083端口,访问生产者: http://localhost:8081/sendRequest");
    }
    @StreamListener("myInput")
    public void receive(byte[] msg){
        System.out.println("接收到的消息是: "+new String(msg));
    }

}

