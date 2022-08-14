package com.hspedu.collection_.Map_;

import sun.util.resources.cldr.it.CalendarData_it_IT;

import java.util.*;

@SuppressWarnings({"all"})
public class MapIt {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Employee employee1 = new Employee("张三",19000,"10001");
        Employee employee2 = new Employee("李四",10000,"10002");
        Employee employee3 = new Employee("王五",17000,"10003");
        hashMap.put(employee1.getIn(),employee1);
        hashMap.put(employee2.getIn(),employee2);
        hashMap.put(employee3.getIn(),employee3);
        Set set=hashMap.keySet();
        for (Object s :set) {
            Employee emp=(Employee)hashMap.get(s) ;
            if(emp.getSalary()>18000){
            System.out.println("s="+s+hashMap.get(s));
        }
        }
        System.out.println(" =======");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object s =  iterator.next();
            Employee emp=(Employee)hashMap.get(s);
            if(emp.getSalary()>18000) {
                System.out.println("s=" + s + hashMap.get(s));
            }
        }
        System.out.println(" ======");
        Set set1 = hashMap.entrySet();

        for (Object s :set1) {

            Map.Entry m=(Map.Entry)s;
            Employee emp=(Employee)m.getValue();
            if(emp.getSalary()>18000) {
                System.out.println("s=" + m.getKey() + "  " + m.getValue());
            }

        }

    }
}
class Employee{
    private String name;
    private double salary;
    private  String in;

    public Employee(String name, double salary, String in) {
        this.name = name;
        this.salary = salary;
        this.in = in;
    }

    @Override
    public String toString() {
            return "name='" + name + '\'' +
                    ", salary=" + salary ;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(in, employee.in);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, in);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getIn() {
        return in;
    }
}