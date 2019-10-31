package com.itsz.febs.server.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "febs-server-system")
public interface HelloFeignClient {

    @GetMapping("/hello")
    String hello(@RequestParam(name = "name") String name);


}
