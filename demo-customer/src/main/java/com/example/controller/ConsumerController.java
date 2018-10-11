package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User:xuyalun
 * Date 2018/10/8
 * Time 下午5:43
 */
@RestController
public class ConsumerController {
    @Reference
    private DemoService demoService;
    @RequestMapping("/hello/{name}")
    private Object sayHello(@PathVariable String name){
        return demoService.sayHello(name);
    }
}
