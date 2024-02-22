package com.devkart.userservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @GetMapping
    public String getUsers() {
        return "Get all users";
    }

    @GetMapping("{id}")
    public String getUserById(@PathVariable("id") Long id) {
        return "Get user by id " + id;
    }
}
