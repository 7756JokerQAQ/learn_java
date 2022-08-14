package com.hspedu.collection_.Map_;


import sun.util.resources.cldr.it.CalendarData_it_IT;

import java.awt.print.Book;
import java.util.*;

@SuppressWarnings({"all"})
public class mapUse {
    public static void main(String[] args) {
            //常用方法
       Map map = new HashMap();
       map.put("邓超",new Books ("",100));
       map.put("邓超","孙俪");
       map.put("王宝强","马蓉");
       map.put("宋姐","马蓉");
       map.put("刘令博",null);
       map.put(null,"刘亦菲");
       map.put("鹿晗","关晓彤");
        System.out.println("map="+map);
       map.remove(null);
        System.out.println("map="+map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue("邓超"));
        //map容器遍历方法
        //第一组先取出所有的key 再通过key取出value
        System.out.println("========");
        Set set = map.keySet();
        //增强for
        for (Object key:set) {
            System.out.println(key+"-"+map.get(key));
        }
        //通过迭代器
        System.out.println("============");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+"-"+map.get(key));

        }
        //第二组把所有的values取出
        System.out.println("==========");
        Collection values = map.values();
        //可以使用collecction的所有方法
        for (Object o :values) {
            System.out.println(o);
        }
        System.out.println("=========");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }
        //通过EntrySet来获取k-v
        System.out.println("=======");
        Set entrySet = map.entrySet();
        for (Object entry :entrySet) {
            //奖entry转换为map.Entry
            Map.Entry m=(Map.Entry)entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }


    }
}

class Books{
    private  String name;
    private int num;

    public Books(String name, int num) {
        this.name = name;
        this.num = num;
    }
}