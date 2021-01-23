package com.qianfeng.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${foo}")
    private String foo;
//    @Value("${server.port}")
//    private String serverPort;
    @Value("${user.name}")
    private String userName;

    @GetMapping("/hello")
    public String hello() {
//        return "Hello, foo = " + foo + ", server.port = " + serverPort;
        return "Hello " + userName + "! foo =" + foo;
    }
}
