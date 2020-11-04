package com.xiaoyu;

import com.xiaoyu.service.HelloService;
import com.xiaoyu.service.impl.HelloServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      //  HelloServiceImpl service = new HelloServiceImpl();
      //  service.sayHello("xiaoYu");

        //使用反射机制执行sayhello方法 核心就是method（类中的方法）它能够去执行方法
        HelloService service = new HelloServiceImpl();

        //获取sayHello(方法)对应的Method类对象        String.class 是sayHello方法的参数是string类型
        //找到这个接口(HelloService)中的sayHello方法    这个method就能代表sayHello方法了
        Method method = HelloService.class.getMethod("sayHello", String.class);

        //通过method可以执行sayHello方法调用
        /**
         * Method类中有一个方法invoke();  public Object invoke(Object obj, Object... args)
         * 第一个参数代表 表示对象的,要执行这个对象的方法，第二个参数代表 方法在执行是的参数
         * 返回值：
         *       Object：方法执行后的返回值
         */
        //表达的意思是执行service对象的sayHello方法  传入那个对象就执行那个对象的方法
        // 此时method代表的是sayHello方法  method是一个独立的方法对象,代表的就是方法
        method.invoke(service,"goutian");



    }
}
