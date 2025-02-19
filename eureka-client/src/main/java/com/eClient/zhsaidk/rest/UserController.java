package com.eClient.zhsaidk.rest;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "Line from eureka-client";
    }
}
