package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringCloud_customer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_customer.class,args);
    }

    //注册为Spring的一个Bean , 方法的返回结果
    @Bean
    // Rest模板（风格）  有算法和所有的服务列表
    /**
     * RestTemplate 会获取所有的服务实例
     *
     * 在Ribbon中有七种负载均衡策略
     * RoundRobinRule 轮询
     * RandomRule 随机
     *
     * RestTemplate 会拦截HTTP请求， 交给对应的拦截器
     * 进行处理，将请求转换具体的url访问路径
     */
    @LoadBalanced
    public RestTemplate restTemplate(){
        //包含了RestTemplate的参数
        return new RestTemplate();
    }
}
