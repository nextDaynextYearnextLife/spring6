package com.zyh.iocxml.DiMap;

import java.util.List;
import java.util.Map;

public class Student {

    private List<Lesson> LessList;
    private Map<String,Teacher> TeacherMap;

    public List<Lesson> getLessList() {
        return LessList;
    }

    public void setLessList(List<Lesson> lessList) {
        LessList = lessList;
    }

    public Map<String, Teacher> getTeacherMap() {
        return TeacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        TeacherMap = teacherMap;
    }

    private String sid;
    private String sname;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    public void run(){
        System.out.println(sid+": "+sname);
        System.out.println(TeacherMap);
    }
}

