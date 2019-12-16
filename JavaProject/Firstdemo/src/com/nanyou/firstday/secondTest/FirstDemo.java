package com.nanyou.firstday.secondTest;

import java.util.*;

/*使用Map集合统计字符串中“123, 456, 789, 123, 456”中每个整数出现的次数并打印出来*/
public class FirstDemo {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<String, Integer>();
        String str = "123,456,789,123,456";
        //利用split将该字符串依据逗号拆分为单个字符串，结果返回一个数组
        String[] sArray = str.split(",");
        System.out.println(Arrays.toString(sArray));//[123, 456, 789, 123, 456]
        for(int i=0;i<sArray.length;i++){
            if(!m1.containsKey(sArray[i])){//判断该集合中是否存在该字符串
                m1.put(sArray[i],1);//若集合中不存在该字符串，则将键值对（sArray[i],1）添加进去
            }else {
                m1.put(sArray[i],m1.get(sArray[i])+1);//若集合中存在该字符串，则将该键对应的值加1
            }
        }
        System.out.println(m1);
    }
}
