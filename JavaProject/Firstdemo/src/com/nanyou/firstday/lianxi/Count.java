package com.nanyou.firstday.lianxi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*bacbhujsabkcuhjdbaj 获取字符串里面每个字符出现的次数
* 要求输出的结果是：a(3)b(3)c(5)...*/

public class Count {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        String str = "bacbhujsabkcuhjdbaj";
        char[] ch = str.toCharArray();
        for (char c:ch) {
            map.put(c,map.containsKey(c) ? map.get(c)+1:1);
        }
        System.out.println(map);
        Set set = map.keySet();
        for (Object s:set) {
            System.out.print(s+"("+map.get(s)+")");

        }
        System.out.println();
    }
}
