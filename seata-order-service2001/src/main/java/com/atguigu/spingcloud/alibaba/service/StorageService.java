package com.atguigu.spingcloud.alibaba.service;

import com.atguigu.spingcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 10:54
 */
@FeignClient(value = "seata-storage-service")  //这里肯定要调用库存微服务
public interface StorageService {

    //比如买了5个1号商品：对1号商品库存减5
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}

