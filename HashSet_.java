package com.hspedu.collection_.Set__;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        //Hashset实现了set的接口
        //HashSet 实际上是HAshmap
        //可以存放null 但只能有一个
        Set hashSet=new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet="+hashSet);
        //hashSet不保证元素是有序的
        //不能有重复的元素


    }
}
