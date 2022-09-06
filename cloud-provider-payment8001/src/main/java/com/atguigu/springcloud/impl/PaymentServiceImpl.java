package com.atguigu.springcloud.impl;

import com.atguigu.spingcloud.entities.entities.Payment;
import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/4/21 23:59
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment){
        return paymentDao.create(payment);
    };
    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    };

}
