package com.zyh.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImpl implements UserDao {

    @Override
    public void run(){
        System.out.println("run--11");
    }

}
