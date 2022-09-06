package com.atguigu.spingcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 10:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T       data;


    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}

