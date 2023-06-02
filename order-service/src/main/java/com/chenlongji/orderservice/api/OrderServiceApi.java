package com.chenlongji.orderservice.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author clj
 * Description: 订单服务api
 */
@RequestMapping("/order")
@RestController
public interface OrderServiceApi {
    /**
     * 创建订单
     * @param userName 用户名
     * @return 返回值
     */
    @PostMapping("/createOrder")
    Map<String, String> createOrder(@RequestParam String userName);

}
