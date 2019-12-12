package com.nanyou.firstday.collectionzuoye;

public class Homwork01 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = str1.replace("a","h");
        System.out.println(str1);
        System.out.println(str1.hashCode());//96354
        System.out.println(str3);
        System.out.println(str3.hashCode());//103081

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<10;i++){
            sb.append(i);
//            System.out.println(sb);
        }
        System.out.println(sb.hashCode());//1915910607
        StringBuffer sb1 = sb.append("oppi");
        System.out.println("+++"+sb);
        System.out.println("---"+sb1);
        System.out.println(sb.hashCode());//1915910607
        System.out.println(sb1.hashCode());//1915910607
        //可以看出，StringBuffer类字符串是可变的，利用append方法对它进行增加内容，增加后地址不变，还是原来那个变量，就是该变量内容被改变了。


    }
}
