package com.nanyou.firstday.Kaoshi;

import java.util.Scanner;
/*张宇婷
1、从键盘输入一个四位数；
* 2、将每一位上的数字加9，然后除以10取余，作为该位上的新数字；
* 3、将第1位和第3位上的数字互换，第2位和第4位上的数字互换，组成加密后的数字
* */

public class Screat {
    public static void main(String[] args) {
        int num,digit1,digit2,digit3,digit4,newnum;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        num = sc.nextInt();
        digit1 = num/1000;
        digit2 = num/100%10;
        digit3 = num/10%10;
        digit4 = num%10;
        digit1 = (digit1+9)%10;
        digit2 = (digit2+9)%10;
        digit3 = (digit3+9)%10;

        temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        temp = digit2;
        digit2 = digit4;
        digit4 = temp;
        newnum = digit1*1000+digit2*100+digit3*10+digit4;
        System.out.println(newnum);
    }
}
