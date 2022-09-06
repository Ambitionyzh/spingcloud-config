package com.atguigu.spingcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.spingcloud.entities.entities.CommonResult;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/3 16:42
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException blockException){
        return new CommonResult(444, "按客户自定义，global handlerException ---1服务不可用");
    }
    public static CommonResult handlerException2(BlockException blockException){
        return new CommonResult(444, "按客户自定义，global handlerException ---2服务不可用");
    }
}
