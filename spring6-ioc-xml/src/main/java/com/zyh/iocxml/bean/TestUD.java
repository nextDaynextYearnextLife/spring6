package com.zyh.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUD {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        //
        UserDao ud = context.getBean(UserDao.class);
        System.out.println(ud);
        ud.run();
    }

}
