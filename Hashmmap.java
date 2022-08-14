package com.hspedu.collection_.Map_;

import java.util.HashMap;
import java.util.Objects;

@SuppressWarnings({"all"})
public class Hashmmap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        for (int i = 0; i <=7; i++) {
            hashMap.put(new A(i),"hello");

        }
        for(int i=8;i<=20;i++)
        {
            hashMap.put(new B(i),"hello");
        }
    }
}
class A{
    private  int m;

    public A(int m) {
        this.m = m;
    }



    @Override
    public int hashCode() {
        return 100;
    }
}
class B{
    private  int n;

    public B(int n) {
        this.n = n;
    }



    @Override
    public int hashCode() {
        return 300;
    }
}