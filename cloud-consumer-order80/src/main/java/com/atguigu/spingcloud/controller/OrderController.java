package com.atguigu.spingcloud.controller;


import com.atguigu.spingcloud.entities.entities.CommonResult;
import com.atguigu.spingcloud.entities.entities.Payment;
import com.atguigu.spingcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/4/22 22:57
 */
@RestController
@Slf4j
public class OrderController {
    public static  final String PYYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;
    @Resource
    private DiscoveryClient discoveryClient;
    @GetMapping("/customer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PYYMENT_URL+"/payment/create",payment, CommonResult.class);
    }
    @GetMapping("/customer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PYYMENT_URL+"/payment/get/"+id,CommonResult.class);

    }
    @GetMapping(value = "/customer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> INSTANCE = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if(INSTANCE == null || INSTANCE.size() <= 0){
            return  null;
        }
        ServiceInstance serviceInstance = loadBalancer.INSTANCE(INSTANCE);
        URI url = serviceInstance.getUri();
        return restTemplate.getForObject(url+"payment/lb",String.class);
    }
    /**
     * 测试链路监控
     */
    @GetMapping(value = "/customer/payment/zipkin")
    public String paymentZipkin(){
        String result = restTemplate.getForObject(PYYMENT_URL+"/payment/zipkin/", String.class);
        return result;
    }


}
