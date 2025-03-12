package com.corematrix.controller;

import com.corematrix.entity.Users;
import com.corematrix.service.JWTService;
import com.corematrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private JWTService jwtService;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {
        return service.saveUser(user);
    }

    @PostMapping("/login")
    public String Verify(@RequestBody Users user){
        return service.Verify(user);
    }
}
