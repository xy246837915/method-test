package com.xiaoyu.service.impl;

import com.xiaoyu.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("你好" + name);
    }
}
