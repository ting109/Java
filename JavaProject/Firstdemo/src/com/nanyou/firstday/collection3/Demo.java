package com.nanyou.firstday.collection3;

import java.util.List;

/*模拟在校学生选课系统,使用集合完成
要求：1.学生类:学号，姓名，所选课程Set<Course>
学生可以对课程做增删改查操作
2.课程类：编号 课程名称
3.学生选课清单类
完成:有n个人 显示出每个人所选的课程信息
如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript 等
*/
public class Demo {
    public static void main(String[] args) {
        Course course1 = new Course(9520,"Java");
        Course course2 = new Course(9521,"C语言");
        Course course3 = new Course(9522,"JS");
        Course course4 = new Course(9523,"php");
        Course course5 = new Course(9524,"python");
        Course course6 = new Course(9525,"mysql");
        Course course7 = new Course(9526,"database");

        Student student1 = new Student(10,"胡焦英");
        student1.addCourse(course1);
        student1.addCourse(course4);

        Student student2 = new Student(11,"程冉");
        student2.addCourse(course2);
        student2.addCourse(course5);

        Student student3 = new Student(12,"肖战");
        student3.addCourse(course7);
        student3.addCourse(course1);

        Student student4 = new Student(13,"王一博");
        student4.addCourse(course3);
        student4.addCourse(course6);

        Checklist.list.add(student1);
        Checklist.list.add(student2);
        Checklist.list.add(student3);
        Checklist.list.add(student4);

        for (Object o:Checklist.list) {
            System.out.println(o);
        }







    }
}
