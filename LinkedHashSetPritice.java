package com.hspedu.collection_.Set__;

import java.util.LinkedHashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class LinkedHashSetPritice {
    public static void main(String[] args) {
        LinkedHashSet set=new LinkedHashSet();
            set.add(new Car("奥拓",1000));
            set.add(new Car("奥迪",300000));
            set.add(new Car("法拉利",1000000));
            set.add(new Car("奥迪",300000));
            set.add(new Car("保时捷",700000000));
            set.add(new Car("奥迪",300000));
        System.out.println("set="+set);
    }
}
 class Car{
    private String name;
    private double price;

     public Car(String name, double price) {
         this.name = name;
         this.price = price;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Car car = (Car) o;
         return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, price);
     }

     @Override
     public String toString() {
         return "\nCar{" +
                 "name='" + name + '\'' +
                 ", price=" + price +
                 '}';
     }
 }