package com.nanyou.firstday.Zuoye;

public class Student extends Person {
    private String school = "南京大学";
    private String stuNumber = "12180997";

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String work(){
        return "学习";
    }
}
