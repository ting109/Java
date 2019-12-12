package com.nanyou.firstday.Zuoye;

public class Car extends Vehicle{
    public int loader;
    public Car(){
        System.out.println("我是car的无参构造器");
    }
    public Car(int num){
        System.out.println("我是car的有参构造器"+num);
    }

    @Override
    public void driver() {
        System.out.println("car自动驾驶");
    }
}
