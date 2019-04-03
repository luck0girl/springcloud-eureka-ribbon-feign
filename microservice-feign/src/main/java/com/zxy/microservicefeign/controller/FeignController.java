package com.zxy.microservicefeign.controller;

import com.zxy.microservicefeign.feignservice.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with zhangxy
 * User: lucky
 * Date: 2019/4/1
 * Time: 15:37
 * Description:
 */
@RestController
public class FeignController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/feigntst")
    public String test(@RequestParam String name){
        return this.demoService.hi(name);
    }

    @RequestMapping("/getmsg")
    public String getmsg(){
        return this.demoService.getmsg();
    }

    @RequestMapping("/msg2")
    public String msg2(@RequestParam String age){
        return this.demoService.msg2(age);
    }
}
