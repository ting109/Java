package com.nanyou.firstday.collectionzuoye;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*计算从出生日期到现在过去了多少年多少天*/

public class Homework02 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期：");
        String str = sc.next();

        //指定日期的格式
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        //创建现在的日期
        Date nowDate = new Date();
        System.out.println("当前日期格式的日期为："+nowDate);
        //将现在的日期转换为当前设定的格式
        String now = s.format(nowDate);
        System.out.println("今天的日期是："+now);

        Date oldDate = s.parse(str);//将字符串类型的日期转换成日期格式,此处str的格式必须与SimpleDateFormat里的设置格式一样
        System.out.println("日期格式的出生日期："+oldDate);
        String old = s.format(oldDate); //将日期格式转换为字符串格式
        System.out.println("字符串格式的出生日期："+old);

        //将出生日期和当前日期转为毫秒值 getTime()
        long birthday = oldDate.getTime();
        long nowaday = nowDate.getTime();
        long value = nowaday-birthday;
        System.out.println("从出生到现在过去了"+value+"毫秒");
        System.out.println("从出生到现在过去了"+value/1000/60/60/24+"天");
        System.out.println("从出生到现在过去了"+value/1000/60/60/24/365+"年");











    }
}
