package com.atguigu.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/30 21:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain83 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain83.class, args);
    }
}
