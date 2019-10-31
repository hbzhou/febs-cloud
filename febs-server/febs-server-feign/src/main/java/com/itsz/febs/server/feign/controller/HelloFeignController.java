package com.itsz.febs.server.feign.controller;

import com.itsz.febs.server.feign.clients.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignClient helloFeignClient;


    @GetMapping("/hello")
    public String hello (String name){
        return  helloFeignClient.hello(name);
    }

}
