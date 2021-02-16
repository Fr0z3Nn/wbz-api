package com.wbz.wbzapi.controller;

import com.wbz.wbzapi.entity.User;
import com.wbz.wbzapi.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class RegistrationController {

    private final UserService userService;

    @PostMapping("/register")
    public void registerUser(@RequestBody User user) {
        System.out.println(userService.register(user));
    }
}