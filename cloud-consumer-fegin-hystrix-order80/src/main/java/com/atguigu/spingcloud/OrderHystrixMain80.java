package com.atguigu.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/15 16:58
 */
@SpringBootApplication
// @EnableEurekaClient 不向Eureka注册了，不是Eureka客户端
@EnableFeignClients //作为Feign客户端
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}
