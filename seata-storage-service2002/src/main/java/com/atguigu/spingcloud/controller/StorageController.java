package com.atguigu.spingcloud.controller;

import com.atguigu.spingcloud.domain.CommonResult;
import com.atguigu.spingcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 15:10
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 库存扣减
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count){

        storageService.decrease(productId, count);

        return new CommonResult(200, "扣减库存成功！");
    }
}

