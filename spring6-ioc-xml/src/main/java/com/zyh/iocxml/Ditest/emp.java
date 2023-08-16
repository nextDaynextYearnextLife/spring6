package com.zyh.iocxml.Ditest;


import java.util.Arrays;

public class emp {

    private Dept dept;
    private String ename;
    private Integer age;

    private String[] hobits;

    public String[] getHobits() {
        return hobits;
    }

    public void setHobits(String[] hobits) {
        this.hobits = hobits;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }




    public void work(){
        System.out.println(ename+" emp work "+age);
        dept.info();
        System.out.println(Arrays.toString(hobits));
    }
}
