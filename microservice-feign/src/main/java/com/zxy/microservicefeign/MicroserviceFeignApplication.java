package com.zxy.microservicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* Feign默认集成了Ribbon，所以具有负载均衡的功能
* */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MicroserviceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceFeignApplication.class, args);
    }

}
