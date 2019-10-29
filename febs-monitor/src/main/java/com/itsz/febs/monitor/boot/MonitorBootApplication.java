package com.itsz.febs.monitor.boot;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MonitorBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorBootApplication.class, args);
    }
}
