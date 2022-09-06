package com.atguigu.spingcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/17 20:59
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_Timeout ,o(╥﹏╥)o";
    }
}
