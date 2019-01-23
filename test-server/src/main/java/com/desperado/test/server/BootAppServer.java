package com.desperado.test.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootAppServer {
    public static void main(String[] args) {
        //System.out.println(this.getClass().getClassLoader().get);
        new ClassPathXmlApplicationContext("classpath:/application.xml");
    }
}
