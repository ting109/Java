package com.nanyou.firstday.collection4;
/*有一个学生类Student   学生编号，学生姓名，
现在对学生仓库做增删改查操作 学生每次被添加  该学生的学号自加1   如 9527   9528  等等*/
public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student(9527,"张珊");
        Student student2 = new Student(9528,"张冉");
        Student student3 = new Student(9529,"王五");

        Tool.list.add(student1);
        Tool.list.add(student2);
        Tool.list.add(student3);

        for (Object o:Tool.list) {
            Student st = (Student)o;//将Object类型的强转为Student类型，并输出结果
            System.out.println(st.getStuNum()+st.getStuName());
            //输出结果为：9528张珊
            //          9529张冉
            //          9530王五
        }

    }
}
