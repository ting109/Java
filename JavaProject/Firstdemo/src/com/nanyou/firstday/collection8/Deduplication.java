package com.nanyou.firstday.collection8;

import java.util.Scanner;
import java.util.TreeSet;

/*手动输入一行字符串，去掉其中重复字符，打印出不同的那些字符*/
public class Deduplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String str = sc.nextLine();
        TreeSet treeSet=new TreeSet();
        char[] arr = str.toCharArray();
        for (char ch:arr) {
            treeSet.add(ch);
        }
        System.out.println(treeSet);
    }

}
