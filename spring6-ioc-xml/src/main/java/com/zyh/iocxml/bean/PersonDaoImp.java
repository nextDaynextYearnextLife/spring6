package com.zyh.iocxml.bean;

public class PersonDaoImp implements UserDao{
    @Override
    public void run() {
        System.out.println("Person Run");
    }
}
