package com.zyh.iocxml.Ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanDiArray.xml");
        emp emp1 = context.getBean("emp", emp.class);
        emp1.work();

    }
}
