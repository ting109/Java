package com.nanyou.firstday.collection5;

import com.nanyou.firstday.collection2.Student;

import java.util.*;

public class ComparatorSort  {
    private ArrayList<Studentscore> arrayList = new ArrayList<Studentscore>();
    public void save(){
        //保存40位同学的姓名、学号、成绩
        Random random = new Random();
        for(int i=0,j=10;i<40;i++){
            int id=180201+i;
            String name="同学"+j++;
            int score = random.nextInt(51)+50;//产生[50,100]范围内的一个随机整数
            arrayList.add(new Studentscore(name,id,score));
        }

    }
    public void sort(){
        //排序，先按照成绩由高到低进行排序，成绩相同时再按照学号由低到高排序
        Comparator<Studentscore> comparator = new Comparator<Studentscore>() {
            @Override
            public int compare(Studentscore o1, Studentscore o2) {
                if(o1.getScore()>o2.getScore()){
                    return -1;
                }else if(o1.getScore()<o2.getScore()){
                    return 1;
                }else{
                    if(o1.getStuNum()>o2.getStuNum()){
                        return 1;
                    }else if(o1.getStuNum()<o2.getStuNum()){
                        return-1;
                    }else
                        return 0;
                }


            }
        };
        Collections.sort(arrayList,comparator);
    }

    public void print(){
        Iterator<Studentscore> iterator = this.arrayList.iterator();
        while(iterator.hasNext()){
            Studentscore s = iterator.next();
            System.out.println("学号："+s.getStuNum()+",姓名："+s.getStuName()+",成绩："+s.getScore());
        }
    }




}
