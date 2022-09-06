package com.atguigu.spingcloud.alibaba.dao;

import com.atguigu.spingcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 10:42
 */
@Mapper
public interface OrderDao {

    //1.新建订单
    void create(Order order);

    //2.修改订单状态，从0->1
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}


