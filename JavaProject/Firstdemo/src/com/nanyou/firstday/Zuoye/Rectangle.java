package com.nanyou.firstday.Zuoye;

public class Rectangle {
    private double length;
    private double width;

    public void area() {

        System.out.println(length * width);
    }

    public void setLength(double length) {

        this.length = length;
    }

    public double getLength() {

        return length;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getWidth() {

        return width;
    }
}
