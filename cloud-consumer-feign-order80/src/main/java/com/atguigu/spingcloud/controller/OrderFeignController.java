package com.atguigu.spingcloud.controller;

import com.atguigu.spingcloud.entities.entities.CommonResult;
import com.atguigu.spingcloud.entities.entities.Payment;
import com.atguigu.spingcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/15 9:25
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/getFeign/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        //通过自己的80的接口层，取调用服务提供者中的接口
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}


