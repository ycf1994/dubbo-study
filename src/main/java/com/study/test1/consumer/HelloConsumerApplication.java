package com.study.test1.consumer;

import com.study.test1.service.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-study
 * @description:
 * @author: longxiu.ycf
 * @create: 2019-04-04 17:41
 **/
public class HelloConsumerApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test1/consumer.xml");
        System.out.println(((IHelloService)context.getBean("helloServiceImpl")).sayHello("YCF"));
    }
}
