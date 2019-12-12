package com.nanyou.firstday.Zuoye;

public class B extends A {
    int i=2;
    public static void main(String[] args) {
        B b = new B();
        b.print(); //由于子类中没有发生方法重写，所以这里也是调用的父类的方法


    }
}
