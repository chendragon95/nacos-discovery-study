package com.chenlongji.userservice.client;

import com.chenlongji.orderservice.api.OrderServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author clj
 * 生产使用 @FeignClient(value = "order-service", url = "http://localhost:8077", contextId = "UserService-OrderServiceClient")
 */
@FeignClient(value = "order-service")
public interface OrderServiceClient extends OrderServiceApi {

}
