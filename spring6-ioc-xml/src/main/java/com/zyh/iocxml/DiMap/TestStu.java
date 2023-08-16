package com.zyh.iocxml.DiMap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {

    @Test
    public void testStu(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanDiref.xml");
        Student s1 = context.getBean("s4", Student.class);
        s1.run();
    }
}
