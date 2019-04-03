package com.zxy.microserviceconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with zhangxy
 * User: lucky
 * Date: 2019/4/1
 * Time: 11:48
 * Description:
 */
@RestController
public class CallController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return this.restTemplate.getForObject("http://EUREKA-CLIENT/client?name=" + name, String.class);
    }

}
