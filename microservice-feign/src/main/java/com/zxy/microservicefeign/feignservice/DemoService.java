package com.zxy.microservicefeign.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with zhangxy
 * User: lucky
 * Date: 2019/4/1
 * Time: 15:35
 * Description: feign使用的时候要注意三个问题
 * 1、@GetMapping不支持
 * 2、PathVarible得设置value值
 * 3、如果参数是复杂对象的话，即使指定了Get请求方式，feign也会自动以post方法发送请求
 * <p>
 * fallback=====》 指定了服务降级逻辑处理类
 */
@FeignClient(name = "eureka-client", fallback = FeignFallBack.class)
public interface DemoService {

    @RequestMapping(value = "/client")
    String hi(@RequestParam String name);


    @RequestMapping(value = "/msg")
    String getmsg();

    @RequestMapping(value = "/msg2")
    String msg2(@RequestParam String age);
}
