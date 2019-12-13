package com.nanyou.firstday.collectionzuoye;
/*
* 定义一个StringBuffer类对象，
1）使用append方法向对象中添加26个字母，并倒序遍历输入
2）删除前五个字符
*
* 注意：
* 1、任何数据在StringBuffer后面追加，都会同化成StringBuffer类型，不会保留自己原来的类型
* 2、StringBuffer是线程不安全的，效率高的，运行速度快
*/

public class Homework04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for(int i=122;i>122-26;i--){
            sb.append((char)i);
        }//倒序输入26个字母
        System.out.println(sb.capacity());//最开始在sb里没有任何字符串时，StringBuffer有默认初始容量为16，在往里面添加字符串后容量会增加，这也说明了StringBuffer是可变的，容量变为
        System.out.println(sb.length());//要计算StringBuffer里的实际内容长度，要用length()
        System.out.println(sb);
        System.out.println(sb.delete(0,5));//删除该字符串中前五个字符
        System.out.println(sb.reverse());//将字符串进行反转,reverse()没有参数，只能将整个字符串进行反转，而不能将其中一部分进行反转
        System.out.println(sb);//sb变为了反转之后的值，内容改变了


    }
}
