package com.nanyou.firstday.Zuoye;

public class Test2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(); //首先在创建对象的时候，Vehicle会执行一次自己的无参构造器。
        Car car = new Car();     //在Car创建对象时，由于car是继承vehicle的，因此它会找到父类vehicle的无参构造器并执行，然后回到自己执行自己的无参构造器
        Truck truck = new Truck();//在Truck创建对象时，由于truck继承Car，Car继承Vehicle,是多层继承，因此会首先执行Vehicle的无参构造器，然后执行car的，最后执行truck的。
        car.driver();
        truck.driver();
        car.setWheels(4);
        truck.setWeight(200);
        System.out.println(car.getWheels()+","+truck.getWeight()); //子类对象可以通过父类提供的公有化方法来访问父类的私有化属性，尽管父类的属性是私有化的，但是它提供了公有化方法，这个公有化方法是可以继承的


    }
}
