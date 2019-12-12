package com.nanyou.firstday.Zuoye;

public class Truck extends Car {
    public double payload;

    public Truck(){
        System.out.println("我是truck的无参构造方法");
    }
    public Truck(String sound){
        System.out.println("卡车噪音很大");
    }

    @Override
    public void driver() {
        super.driver();
    }
}
