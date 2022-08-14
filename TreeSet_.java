package com.hspedu.collection_.Set__;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               // return ((String)o2).compareTo((String ) o1);
                return ((String)o1).length()-((String)o2).length();
            }
        });

        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("jack");
        treeSet.add("jack");
        System.out.println("treeSet="+treeSet);
    }
}
