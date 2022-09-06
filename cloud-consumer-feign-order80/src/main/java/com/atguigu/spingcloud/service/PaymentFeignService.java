package com.atguigu.spingcloud.service;

import com.atguigu.spingcloud.entities.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/15 9:21
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") //作为一个Feign功能绑定的的接口
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}

