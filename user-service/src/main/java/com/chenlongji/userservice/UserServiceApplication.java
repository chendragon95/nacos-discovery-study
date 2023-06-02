package com.chenlongji.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author clj
 * 注解@EnableDiscoveryClient说明:
 *    新版Spring Cloud不在需要@EnableDiscoveryClient注解
 *    Dalston.SR4版本及之前主函数上需要添加该注解.
 *    (拓展)可以添加DiscoveryClient的实现到类路径中，这种SpringBoot应用就可以注册到服务发现服务器中
 */
@SpringBootApplication
@EnableFeignClients
//@EnableDiscoveryClient
public class UserServiceApplication {

    /**
     * nacos官方文档: https://nacos.io/zh-cn/docs/what-is-nacos.html
     */
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
