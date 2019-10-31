package com.itsz.febs.server.feign.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {
        "com.itsz.febs.server.feign.boot",
        "com.itsz.febs.server.feign.controller",

})
public class FeignBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignBootApplication.class,args);
    }
}
