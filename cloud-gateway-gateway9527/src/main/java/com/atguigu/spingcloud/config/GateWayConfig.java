package com.atguigu.spingcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/24 21:26
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){

        //构建一个路由器
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        //路由器的id是：path_route_atguigu，规则是我现在访问/guonei，将会转发到http://news.baidu.com/guonei
        routes.route("path_route_atguigu",
                r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }


}
