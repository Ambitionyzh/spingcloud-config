package com.atguigu.springcloud.service;


import com.atguigu.spingcloud.entities.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/4/21 23:57
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
