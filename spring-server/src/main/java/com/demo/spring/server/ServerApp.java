package com.demo.spring.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApp {

    public static void main(String[] args) {

        SpringApplication.run(ServerApp.class, args);
        System.out.println("简单eureka服务器:   http:localhost:8761");
    }

}

