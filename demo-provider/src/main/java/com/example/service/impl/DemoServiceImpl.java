package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.DemoService;

/**
 * User:xuyalun
 * Date 2018/10/8
 * Time 下午5:40
 */
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}