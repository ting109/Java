package com.nanyou.firstday.Zuoye;

public class Vehicle {
    private int wheels;
    private double weight;

    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public int getWheels(){
        return wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
    public Vehicle(){
        System.out.println("我是父类的无参构造器");
    }
    public Vehicle(String str){
        System.out.println("我是父类的有参构造器"+str);
    }
    public void driver(){
        System.out.println("驾驶车辆");
    }
}
