package com.devkart.productservice.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userservice")
public interface UsersFeignClient {
    @GetMapping("/api/v1/users/{id}")
    String getUserById(@PathVariable("id") Long id);
}
