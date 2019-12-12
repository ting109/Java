package com.nanyou.firstday.Zuoye;

public class Test1 {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Worker worker = new Worker();
        StudentLeader studentLeader = new StudentLeader();

        person.setName("王一博");
        person.setAge(25);
        person.setGender("男");
        person.setNationality("中国");
        student.setAge(30);
        System.out.println(person.getName()+"的工作是"+student.work());
        System.out.println(person.getName()+"的工作是"+worker.work());

//        System.out.println(person.getName()+person.getGender()+student.getAge()+person.getNationality());

    }
}
