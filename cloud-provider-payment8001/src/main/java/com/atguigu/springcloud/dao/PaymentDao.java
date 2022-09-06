package com.atguigu.springcloud.dao;


import com.atguigu.spingcloud.entities.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/4/21 23:44
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
