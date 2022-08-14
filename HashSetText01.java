package com.hspedu.collection_.Set__;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSetText01 {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        for (int i = 0; i <= 7; i++) {
               // hashSet.add(i);
            hashSet.add(new A(i));

        }
    }
}
class A{
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
class B{
    private int n;

    public B(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n);
    }
}