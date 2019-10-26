package com.itsz.febs.register.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterBootApplication.class,args);
    }
}
