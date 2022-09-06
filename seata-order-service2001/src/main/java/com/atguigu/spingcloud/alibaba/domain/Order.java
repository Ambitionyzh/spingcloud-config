package com.atguigu.spingcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 10:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order
{
    private Long id;


    private Long userId;


    private Long productId;


    private Integer count;


    private BigDecimal money;


    private Integer status; //订单状态：0：创建中；1：已完结
}


