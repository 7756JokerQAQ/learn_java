package com.hspedu.collection_.Map_;

import java.util.Properties;

@SuppressWarnings({"all"})
public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //K-v都不能为null
        properties.put("abc",123);
        properties.put("john","约翰");
        properties.put("lic",100);
        properties.put("lic",13); //跟hashtable 一样相同的k 然后v替换
        System.out.println("properties="+properties);
        //properties的几种方法 增删改查
        System.out.println(properties.get("abc"));
        properties.remove("lic");
        System.out.println(properties);
        //改
        properties.put("john",30);
        System.out.println(properties);

    }
}
