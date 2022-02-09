package com.learnup.spring;

import com.learnup.spring.services.MySuperService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myConfig.xml");
        final MySuperService beanMSS = context.getBean(MySuperService.class);
        beanMSS.doSmth();
    }
}
