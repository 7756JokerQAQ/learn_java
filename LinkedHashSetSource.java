package com.hspedu.collection_.Set__;

import java.util.LinkedHashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set  set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘",1001));
        set.add(123);
        set.add("HSP");
        System.out.println("set="+set);
        //LinKedHashSet底层维护的是一个LinkedHashMap
        //LinkedHashSet底层结构（数组table+双向链表）
        //添加第一次时直接奖数组table扩容到16村对方的结点类型LinkedHashMap$Entry
        //数组时HashMap￥Node【】存放的数据时linkedHashMap$Entry类型 继承关系在内部类

    }
}
class Customer{
    private String name;
    private  int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }
}
