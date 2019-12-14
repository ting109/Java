package com.nanyou.firstday.collection5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/*某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，给出所有同学的成绩（可随机产生，范围为 50-100），
请编写程序将本班各位同学成绩从高往低排序打印输出，注：成绩相同时学号较小的优先打印。要求：打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩
*/
public class Studentscore {
    private String stuName;
    private int stuNum;
    private int score;

    public Studentscore() {
    }

    public Studentscore(String stuName, int stuNum, int score) {
        this.stuName = stuName;
        this.stuNum = stuNum;
        this.score = score;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



    }


