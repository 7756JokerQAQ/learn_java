package com.hspedu.collection_.Set__;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSet_01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //在执行add方法是会通过一个boolean函数 重复添加失败
        set.add(new String("hsp")); //ok
        set.add(new String("hsp"));  //失败
        System.out.println(set);
        //HashSet底层时HashMap,Hashmap底层时(数组+链表+红黑树)
        Node []table =new Node[16];

        Node john=new Node("john",null);
        table[2]=john;
        System.out.println("table="+table);
    }
}
@SuppressWarnings({"all"})
class Node{
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}