package com.atguigu.spingcloud.alibaba.controller;

import com.atguigu.spingcloud.alibaba.domain.CommonResult;
import com.atguigu.spingcloud.alibaba.domain.Order;
import com.atguigu.spingcloud.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 11:04
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/order/create")
    public CommonResult create(Order order){
        orderService.creat(order);
        return new CommonResult(200, "订单创建成功");
    }
}


