package com.hspedu.collection_.Set__;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set="+hashSet);
       int []nums=new int[10];
       
        //hashSet
        /*
          1.public HashSet() {
        map = new HashMap<>();
        }
        //执行add方法
         2. public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
    3.在执行put方法
      public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }
         */
    }
}
