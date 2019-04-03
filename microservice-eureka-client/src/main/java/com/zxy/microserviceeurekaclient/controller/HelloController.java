package com.zxy.microserviceeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with zhangxy
 * User: lucky
 * Date: 2019/4/1
 * Time: 11:28
 * Description:
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/client")
    public String hi(@RequestParam("name") String name) {
        return "HI,i am " + name + " from port: " + port;
    }

    @RequestMapping(value = "/msg")
    public String getmsg() {
        return "this is a msg from service eureka-client with port +" + port;
    }

    @RequestMapping(value = "/msg2")
    public String msg2(@RequestParam String age){
        return "this is a msg from service eureka-client with port +" + age;
    }
}
