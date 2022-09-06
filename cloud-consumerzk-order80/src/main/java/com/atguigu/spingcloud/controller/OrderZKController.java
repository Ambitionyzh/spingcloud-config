package com.atguigu.spingcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/10 21:20
 */
@RestController
@Slf4j
public class OrderZKController {
    //由于在ApplicationContextConfig开启了负载均衡，这里可以通过服务名访问到微服务
    public static final  String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    //返回String测试一下：不交互数据库了
    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);

        return result;
    }


}
