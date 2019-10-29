package com.itsz.febs.auth.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableDiscoveryClient
@SpringBootApplication( scanBasePackages = {
        "com.itsz.febs.auth.boot",
        "com.itsz.febs.auth.user.service",
        "com.itsz.febs.auth.user.controller"

})
public class AuthBootApplication implements CommandLineRunner {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    public static void main(String[] args) {
        SpringApplication.run(AuthBootApplication.class,args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(passwordEncoder.encode("abc123"));

    }
}
