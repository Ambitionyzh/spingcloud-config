package com.atguigu.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/4/25 23:33
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002{
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
    }
}
