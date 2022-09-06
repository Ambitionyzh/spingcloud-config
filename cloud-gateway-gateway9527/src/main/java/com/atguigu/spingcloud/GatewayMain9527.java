package com.atguigu.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/23 23:32
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527{

    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class, args);
    }
}