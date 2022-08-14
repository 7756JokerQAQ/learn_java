package com.hspedu.collection_.Set__;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
@SuppressWarnings({"all"})
public class set_ {
    public static void main(String[] args) {
        //无序
        //set接口和Collection的子接口 一次常用方法和他以一样
        //不能使用索引的方式来获取
        //set接口的实现类的对象，不能存放重复的元素
        //添加的顺序和取出的顺序不一致
        Set set=new HashSet();
        set.add("jhon");
        set.add("lucy");
        set.add("jhon");
        set.add("jack");
        set.add("hsp");
        set.add("marry");
        //set接口存放对象是无序的 添加的对象和取出的对象顺序不一致
        //set容器取出的顺序一一定 他的底层是一个数组+链表
        //虽然不是添加的顺序 但他的顺序一定
        set.add(null);
        set.add(null);
        //遍历的方法 迭代器

        Iterator iterator= set.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        set.remove(null);
        //增强for循环  底层为hashmap
       for (Object s:set){
           System.out.println("s="+s);
       }
    }
}
