package com.nanyou.firstday.lianxi;

/*1.将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
            将上诉字节数组  从指定的位置开始到结束转换成字符串输出
            2.同样的自定义一个字符数组用字符串的方式输出
         3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
         4."我是你的谁,我是你的剑" 判断是否包含 "剑"  contains()
         5.第四题字符串判断是否以"我开头",判断是否以"剑"结尾 endsWith()
         6.String   str=""和 String  str2=null; 判断他们是否为空
         7.找到此字符串"我是你的小宝贝"的 "我" 进行输出  charAt()
         8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置indexOf()
         9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"  lastIndexOf()
         10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串   subString()
         11." 我是你的谁,我是你的剑 " 去除字符串左右空格       trim()删除头尾空白符
         12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
         13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
         14. 比较 "avabc" 和 "avab" 字符串
         15. 将字符数组转换成 字符串输出
         16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组*/

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {

    public static  void main(java.lang.String[] args) throws UnsupportedEncodingException {

        //3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
        String str1 = "abcdw";
        String str2 = "ABCDw";
//        boolean retVal;
//        retVal = str1.equals(str2);
//        str1.equals(str2);
        System.out.println( str1.equals(str2));

       // 4."我是你的谁,我是你的剑" 判断是否包含 "剑"  contains()
        String str = "我是你的谁，我是你的剑";
        boolean status = str.contains("剑");
        if(status){
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }


        //5.第四题字符串判断是否以"我"开头,判断是否以"剑"结尾 endsWith()
        System.out.println(str.startsWith("我"));
        System.out.println(str.endsWith("剑"));

        //6.String   str=""和 String  str2=null; 判断他们是否为空
        String str3="";
        String str4=null;
        if(str2==null||str2.equals("")){
            System.out.println("1111");
        }

//         7.找到此字符串"我是你的小宝贝"的 "我" 进行输出
        String str5="我是你的小宝贝";
        char result = str.charAt(0);
        System.out.println(result);
//        8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置indexOf()
        System.out.println(str.indexOf('你'));
//        9.找到上面 8 题的 最后一次出现 "你" 的位置,lastIndexOf();然后再从 第4个位置开始找  第一次出现的"你"indexOf('你'，4)
        System.out.println(str.lastIndexOf('你'));
        System.out.println(str.indexOf('你',4));
        //10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串   subString()
        System.out.println(str.substring(2,8));
//        11." 我是你的谁,我是你的剑 " 去除字符串左右空格       trim()删除头尾空白符
        String s0 = " 我是你的谁，我是你的剑。 ";
        System.out.print("删除头尾空白符：");
        System.out.println(s0.trim()+"----");
//        12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
        //replace(oldchar,newchar)是替换某个字符；replaceAll(oldstring,newstring)替换某个字符串；
        System.out.print("替换“剑”为“被子”：");
        System.out.println(str.replaceAll("谁","被子"));
//        13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
        System.out.print("替换该字符串中所有的“你”为“哈”:");
        System.out.println(str.replace('你','哈'));
//        14. 比较 "avabc" 和 "avab" 字符串  compareTo()
        String s1 = "avabc";
        String s2 = "avab";
        int result1 = s1.compareTo(s2);
        System.out.println(result1);

//        15. 将字符数组转换成 字符串输出   valueOf()
        char[] array = new char[] {'H','e','l','l','o','w','W','o','r','l','d'};
        String s3 = String.valueOf(array);
        System.out.println(s3);
        System.out.println(array.toString());
        System.out.println(Arrays.toString(array));


        //将字符串转换成字符数组  toCharArray()将字符串转换成字符数组
        String s4 = "i am a girl";
        char[] array1 = s4.toCharArray();
        System.out.println(Arrays.toString(array1));

//        将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
        byte[] array2 = new byte[]{65,67,68,97,98,101};
        String t = new String(array2);
        System.out.println(t);

        byte[] myBytes = {65,66,67};
        String t1 = new String(myBytes);
        System.out.println(t1);

        //字符串转为字节数组
        String myStr = "beauty";
        byte[] t2 = myStr.getBytes();
        System.out.println(Arrays.toString(t2));

//     将上述字节数组，从指定的位置开始到结束转换成字符串输出
        System.out.println("+++++++");
        System.out.println(new String(array2,2,4));

//     16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组
        byte[] array3 = new byte[]{65,67,68,97,98,101};
        String t3 = new String(array3, StandardCharsets.UTF_16);
        System.out.println(t3);
        byte[] t4 = t3.getBytes("UTF-16");
        System.out.println(Arrays.toString(t4)+"-----");











    }
}
