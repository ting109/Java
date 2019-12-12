package com.nanyou.firstday.Zuoye;

public class SonRec extends Rectangle {
   private double length;
   private double width;
   private double height;



    public void setLength(double length) {

        this.length = length;
    }
    public double getLength(){

        return length;
    }
    public void setWidth(double width){

        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){

        this.height = height;
    }
    public double getHeight(){

        return height;
    }

    public void volume(){
        System.out.println(length*width*height);
    }
}
