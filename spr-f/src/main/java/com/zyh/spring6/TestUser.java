package com.zyh.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    //create log
    private Logger logger = LoggerFactory.getLogger(TestUser.class);




    @Test
    public void TestUserobj(){
        //load spring xml
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //new obj
        User user = (User) context.getBean("user");
        System.out.println(user);
        //use obj function
        user.add();

        //
        logger.info("run cess");
    }

    // inve
    @Test
    public void testUobj() throws Exception{
        //get class obj
        Class clazz = Class.forName("com.zyh.spring6.User");
        //



        //
        Object o = (User)clazz.getDeclaredConstructor().newInstance();
        System.out.println(o);
    }



}
