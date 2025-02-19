package com.eurekaclient1.zhsaidk.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "Line from eureka-client-1";
    }
}
