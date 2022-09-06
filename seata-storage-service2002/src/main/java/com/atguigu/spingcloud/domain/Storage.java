package com.atguigu.spingcloud.domain;

import lombok.Data;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 15:03
 */
@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;

    //已用库存
    private Integer used;

    //剩余库存
    private Integer residue;
}

