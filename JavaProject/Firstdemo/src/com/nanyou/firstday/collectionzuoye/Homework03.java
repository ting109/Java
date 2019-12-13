package com.nanyou.firstday.collectionzuoye;

import java.util.Scanner;

/*设计一种方法，用来实现任意范围内的随机数
* 1、从键盘输入一个开始的值start,和一个结束的值end
* int start;int end;
* 2、获取start和end范围内的任意随机数
* 3、输出该随机数*/
public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个起始值：");
        int start = sc.nextInt();
        System.out.println("输入一个终止值：");
        int end = sc.nextInt();
        getRan(start,end);


        }
        //获取start，end范围内的随机数
        public static void getRan(int start1,int end1){
            if(start1>end1){
                System.out.println("输入有误！");
            }else{
                int ran = (int)(Math.random()*(end1-start1)+start1);
                System.out.println(ran);
            }





    }

}
