package com.chenlongji.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author clj
 * 注解@EnableDiscoveryClient说明:
 *    新版Spring Cloud不在需要@EnableDiscoveryClient注解
 *    Dalston.SR4版本及之前主函数上需要添加该注解.
 *    (拓展)可以添加DiscoveryClient的实现到类路径中，这种SpringBoot应用就可以注册到服务发现服务器中
 */

@SpringBootApplication
//@EnableDiscoveryClient
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
