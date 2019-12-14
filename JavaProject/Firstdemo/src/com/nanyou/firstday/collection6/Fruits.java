package com.nanyou.firstday.collection6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*在一个列表中存储以下元素：apple,grape,banana,pear
  返回集合中的最大的和最小的元素
  将集合进行排序，并将排序后的结果打印在控制台上
*/
public class Fruits {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("apple");
        arrayList.add("grape");
        arrayList.add("banana");
        arrayList.add("pear");
        String max = Collections.max(arrayList);
        System.out.print("最大值为："+max);
        String min = Collections.min(arrayList);
        System.out.println("最小值为："+min);
        Collections.sort(arrayList);

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
