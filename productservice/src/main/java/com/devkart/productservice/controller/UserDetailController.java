package com.devkart.productservice.controller;

import com.devkart.productservice.service.IUserService;
import com.devkart.productservice.service.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class UserDetailController {
    IUserService userService;
    public UserDetailController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public String getUserDetails(@PathVariable("id") Long id) {
        return userService.getUserDetails(id);
    }
}
