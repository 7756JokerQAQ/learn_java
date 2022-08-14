package com.hspedu.collection_.Map_;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all"})
public class map_ {
    public static void main(String[] args) {
            //map和coullection并列存在用于保存具有映射的数据 key-value
        //HashMap hashMap = new HashMap();
        //map中的value是可以重复的
        //map中的key不能重复
        //map中的key可value可以为空 key只能有一个  value可以有多个
        //大部分用String来做key  也可以用 数字和Object来做key
        //可以通过key找到value
        Map map=new HashMap();
        map.put("no2","韩曙平");  //k-V
        map.put("no1","张无忌");  //k-V
        map.put("no1","张三丰"); //是一种替换机制
        System.out.println("map="+map);
        System.out.println( map.get("no1"));
    }
}
