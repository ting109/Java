package com.nanyou.firstday.Zuoye;

public class Testrec {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        SonRec sonRec = new SonRec();
        rectangle.setLength(5.1);
        rectangle.setWidth(6.2);
        sonRec.setLength(8.1);
        sonRec.setWidth(7.1);
        sonRec.setHeight(2.3);
        rectangle.area();
        sonRec.volume();
    }
}
