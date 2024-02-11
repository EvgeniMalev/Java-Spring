package com.ivanspotter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");

        IvansPottery pottery = (IvansPottery) context.getBean("potbean");
        pottery.displayInfo();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
