package com.atguigu.spingcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 15:06
 */
@Mapper
public interface StorageDao {
    //扣减库存：根据产品ID扣除
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}



