package com.itsz.febs.server.system.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {
        "com.itsz.febs.commons.utils",
        "com.itsz.febs.server.system.boot",
        "com.itsz.febs.server.system.modules.dept.controller",
        "com.itsz.febs.server.system.modules.dept.service",
        "com.itsz.febs.server.system.modules.user.controller",
        "com.itsz.febs.server.system.modules.user.service",
        "com.itsz.febs.server.system.modules.menu.controller",
        "com.itsz.febs.server.system.modules.menu.service",
        "com.itsz.febs.server.system.modules.role.controller",
        "com.itsz.febs.server.system.modules.role.service",
        "com.itsz.febs.server.system.modules.hello",

})
@RestController
public class SystemBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemBootApplication.class,args);

    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello System Server";
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder (){
        return  new BCryptPasswordEncoder();
    }
}


