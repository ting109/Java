package com.nanyou.firstday.collection3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int stuNum;
    private String stuName;
    private List list;

    public Student(int stuNum, String stuName) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        list = new ArrayList();
    }

    public Student() {

    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
    public void addCourse(Course course){
        list.add(course);

    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", stuName='" + stuName + '\'' +
                ", list=" + list +
                '}';
    }
}
