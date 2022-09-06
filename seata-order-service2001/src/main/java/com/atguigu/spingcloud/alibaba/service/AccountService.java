package com.atguigu.spingcloud.alibaba.service;

import com.atguigu.spingcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 10:55
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long productId, @RequestParam("money") BigDecimal money);
}


