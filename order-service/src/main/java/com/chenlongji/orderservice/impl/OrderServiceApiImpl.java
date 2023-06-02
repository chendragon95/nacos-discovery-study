package com.chenlongji.orderservice.impl;

import com.chenlongji.orderservice.api.OrderServiceApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author clj
 */
@Service
public class OrderServiceApiImpl implements OrderServiceApi {
    @Value("${server.port}")
    private String port;

    @Override
    public Map<String, String> createOrder(String userName) {
        Map<String, String> result = new HashMap<>(2);
        result.put("serverPort", port);
        result.put("userName", userName);
        System.out.println("订单服务:" + port + " 创建了订单, userName=" + userName);
        return result;
    }

}
