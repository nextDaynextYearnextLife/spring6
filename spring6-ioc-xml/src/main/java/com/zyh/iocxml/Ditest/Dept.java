package com.zyh.iocxml.Ditest;

import java.util.List;

public class Dept {
    private String Dname;
    private List<emp> empList;



    public List<emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<emp> empList) {
        this.empList = empList;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public void info(){
        System.out.println("Dname: "+Dname);
        for (emp e: empList
             ) {
            System.out.println(e.getEname()+" :" +e.getAge());
        }

    }
}
