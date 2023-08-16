package com.zyh.iocxml.Ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanDiList.xml");
        Dept dept1 = context.getBean("dept", Dept.class);
        dept1.info();
    }
}
