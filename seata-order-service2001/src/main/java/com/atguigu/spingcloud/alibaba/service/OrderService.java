package com.atguigu.spingcloud.alibaba.service;

import com.atguigu.spingcloud.alibaba.domain.Order;
import org.springframework.stereotype.Service;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 10:52
 */
@Service
public interface OrderService {
    void creat(Order order);
}
