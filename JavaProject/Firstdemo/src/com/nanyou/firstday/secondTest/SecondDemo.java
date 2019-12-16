package com.nanyou.firstday.secondTest;

import java.util.*;

/*从控制台输入若干个单词（输入回车结束）放入集合中，将这些单词排序后（忽略大小写）打印出来*/
public class SecondDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入单词：");
        String str = sc.nextLine();
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0;i<s.length;i++){
            arr.add(s[i]);
        }
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(arr);//按照字母的顺序进行排序，忽略大小写
    }
}
