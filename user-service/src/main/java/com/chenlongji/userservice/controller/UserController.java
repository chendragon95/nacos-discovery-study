package com.chenlongji.userservice.controller;

import com.chenlongji.userservice.client.OrderServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author clj
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private OrderServiceClient orderServiceClient;

    /**
     * 请求路径: http://localhost:8011/user/test
     */
    @GetMapping("/test")
    public String test (){

        Map<String, String> result = orderServiceClient.createOrder("zhangsan");
        return result.toString();
    }

}
