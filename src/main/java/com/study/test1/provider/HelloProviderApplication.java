package com.study.test1.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-study
 * @description:
 * @author: longxiu.ycf
 * @create: 2019-04-04 17:41
 **/
public class HelloProviderApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test1/provider.xml");
        context.start();
        System.out.println("服务提供者已启动");
        System.in.read();
    }
}
