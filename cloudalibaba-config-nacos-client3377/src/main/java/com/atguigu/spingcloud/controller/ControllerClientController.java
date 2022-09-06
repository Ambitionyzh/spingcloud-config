package com.atguigu.spingcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/30 22:12
 */
@RestController
@RefreshScope //支持Nacos的动态刷新功能
public class ControllerClientController {

    @Value("${config.info}")  //在Nacos配置中心的配置文件内容
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}

