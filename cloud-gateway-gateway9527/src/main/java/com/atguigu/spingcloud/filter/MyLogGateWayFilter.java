package com.atguigu.spingcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author Yong
 * @version 1.0
 * @description: TODO
 * @date 2022/5/24 22:56
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("*********************come in MyLogGateWayFilter:  "+ new Date());
        //取出请求参数的uname对应的值
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if(uname == null){
            log.info("************* 用户名为Null 非法用户 o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        //反之，调用下一个过滤器，也就是放行：在该环节判断通过的exchange放行，交给下一个filter判断
        return chain.filter(exchange);

    }

    @Override
    public int getOrder() {
        return 0;
    }
}
