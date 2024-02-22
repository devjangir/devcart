package com.devkart.productservice.service;

import com.devkart.productservice.service.client.UsersFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService{
    private UsersFeignClient usersFeignClient;
    public String getUserDetails(Long id) {
        return usersFeignClient.getUserById(id);
    }
}
