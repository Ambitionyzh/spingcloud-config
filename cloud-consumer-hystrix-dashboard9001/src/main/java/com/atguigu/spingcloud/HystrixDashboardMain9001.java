package com.atguigu.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/22 10:05
 */
@SpringBootApplication
@EnableHystrixDashboard //开启Hystrix仪表盘
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class, args);
    }
}

