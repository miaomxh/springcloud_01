package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
// 启用Eureka服务，将当前应用程序注册为Eureka注册中心
@EnableEurekaServer
@SpringBootApplication
public class SpringCloud_enreka {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_enreka.class,args);
    }
}
