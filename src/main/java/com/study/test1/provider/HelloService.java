package com.study.test1.provider;

import com.study.test1.service.IHelloService;

/**
 * @program: dubbo-study
 * @description:
 * @author: longxiu.ycf
 * @create: 2019-04-04 17:31
 **/
public class HelloService implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
