package com.atguigu.spingcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/14 9:32
 */
public interface LoadBalancer {
    ServiceInstance INSTANCE(List<ServiceInstance> serviceInstances);
}
