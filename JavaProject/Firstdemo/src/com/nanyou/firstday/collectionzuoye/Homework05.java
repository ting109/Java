package com.nanyou.firstday.collectionzuoye;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*将字符串中的指定部分进行反转
* 利用StringBuffer/StringBuilder方法
* 1、指出要指定字符串的初始索引值和结束索引值，
* 2、然后先加入初始索引值之前的子字符串进入StringBuilder字符串
* 3、在倒序遍历依次加入指定的字符串
* 4、最后加入结束索引值字符串之后的子字符串
* 5、输出反转后的新字符串*/
public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();
        System.out.println(reverse(str,1,5));

    }


    public static String reverse(String str1,int startIndex,int endIndex){
        if(str1!=null){
            StringBuilder stringBuilder = new StringBuilder();//创建一个空的StringBuilder字符串
            stringBuilder.append(str1.substring(0,startIndex));//把字符串str1的startIndex索引值之前的子字符串添加到StringBuilder字符串中
            for(int i=endIndex;i>=startIndex;i--){
                stringBuilder.append(str1.charAt(i));
            }
            stringBuilder.append(str1.substring(endIndex+1));
            return stringBuilder.toString();

        }else{
           return null;
        }


    }



}
