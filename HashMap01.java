package com.hspedu.collection_.Map_;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java", 10);
        map.put("php", 10);
        map.put("java", 20);
        System.out.println("map=" + map);
    }
}
