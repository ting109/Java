package com.nanyou.firstday.collection4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int stuNum;
    private String stuName;

    public Student() {
    }

    public Student(int stuNum, String stuName) {
        this.stuNum = stuNum+1;//每次添加学生时，学号自加1
        this.stuName = stuName;
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
}
