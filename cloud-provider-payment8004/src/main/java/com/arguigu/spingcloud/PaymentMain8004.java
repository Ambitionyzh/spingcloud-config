package com.arguigu.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/3 10:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8004.class, args);
    }

}
