package com.nanyou.firstday.secondTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*ArrayList集合嵌套HashMap集合并遍历。
需求：假设ArrayList集合的元素是HashMap。有3个。每一个HashMap集合的键和值都是字符串。
元素我已经完成，请遍历。ArrayList<HashMap<String,String>>
结果：
 周瑜---小乔
 吕布---貂蝉


 郭靖---黄蓉
 杨过---小龙女


 令狐冲---任盈盈
 林平之---岳灵珊
*/
public class ThirdDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<HashMap<String,String>>();

        //有三个 HashMap集合
        HashMap<String,String> h1 = new HashMap<String, String>();
        h1.put("周瑜","小乔");
        h1.put("吕布","貂蝉");
        arrayList.add(h1);

        HashMap<String,String> h2 = new HashMap<String, String>();
        h2.put("郭靖","黄蓉");
        h2.put("杨过","小龙女");
        arrayList.add(h2);

        HashMap<String,String> h3 = new HashMap<String, String>();
        h3.put("令狐冲","任盈盈");
        h3.put("林平之","岳灵珊");
        arrayList.add(h3);

        for (HashMap<String,String> h:arrayList) {
            Set<String> set = h.keySet();//将键全部取出来，存到集合set中
            for (String key:set) {
                 String value = h.get(key);
                System.out.println(key+"----"+value);

            }

        }








    }
}
