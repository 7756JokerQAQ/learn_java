package com.hspedu.collection_.Set__;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("rose"));
        System.out.println("set="+set);
    }
}
