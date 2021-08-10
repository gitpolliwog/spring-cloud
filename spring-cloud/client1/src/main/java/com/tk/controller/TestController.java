package com.tk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/haveatry")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) throws InterruptedException {
//        Thread.sleep(5000);
        return "微服务 client-test被调用， " + "name为:" + name + " ,被调用的服务端口 port:" + port;
    }

}
