package com.zxy.microservicefeign.feignservice;

import org.springframework.stereotype.Component;

/**
 * Created with zhangxy
 * User: lucky
 * Date: 2019/4/2
 * Time: 9:44
 * Description: FeignInterface接口的降级服务
 */
@Component
public class FeignFallBack implements DemoService {
    @Override
    public String hi(String name) {
        return "sorry,some error happend with hi（）,parameter is " + name;
    }

    @Override
    public String getmsg() {
        return "sorry,some error happend with getmsg（）";
    }

    @Override
    public String msg2(String age) {
        return "sorry,some error happend with msg2（）,parameter is " + age;
    }
}
