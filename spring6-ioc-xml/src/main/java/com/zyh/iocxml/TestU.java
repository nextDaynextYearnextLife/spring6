package com.zyh.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestU {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //getBean
        //1
        User user = (User) context.getBean("user");
        System.out.println(user);
        //2
        User user2 = context.getBean(User.class);
        System.out.println(user2);
        //3
        User user3 = context.getBean("user", User.class);
        System.out.println(user3);

    }

}
