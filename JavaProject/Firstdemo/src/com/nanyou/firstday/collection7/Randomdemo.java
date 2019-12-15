package com.nanyou.firstday.collection7;
/*产生10个1~20之间的随机数，要求随机数不能重复*/
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Randomdemo {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet treeSet = new TreeSet();
        for(int i=0;i<10;i++){
            treeSet.add(random.nextInt(20)+1);
        }
        for (Object o:treeSet) {
            System.out.println(o);
        }



    }
}
