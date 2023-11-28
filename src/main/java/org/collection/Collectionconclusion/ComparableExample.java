package org.collection.Collectionconclusion;

import java.util.*;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    Double percentage;
    public Employee(int id,String name,Double percentage){
    this.id = id;
    this.name = name;
    this.percentage = percentage;
    }

    @Override
    public int compareTo(Employee o) {
        if(percentage == o.percentage){
            return 0;
        } else if (percentage > o.percentage) {
            return 1;
        }
        else{
            return -1;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}


public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 78.5));
        employees.add(new Employee(102, "Bob", 89.2));
        employees.add(new Employee(103, "Charlie", 67.8));
        employees.add(new Employee(104, "David", 92.3));
        employees.add(new Employee(105, "Emma", 75.6));
        employees.add(new Employee(106, "Frank", 81.1));
        employees.add(new Employee(107, "Grace", 69.4));
        employees.add(new Employee(108, "Henry", 88.7));
        employees.add(new Employee(109, "Ivy", 83.9));
        employees.add(new Employee(110, "Jack", 72.0));

        Collections.sort(employees);

        Iterator itr = employees.iterator();
        while(itr.hasNext()){
            Employee e = (Employee) itr.next();
            System.out.println(e.id + " :" + e.name + " :" + e.percentage);
        }

        System.out.println("----Printing with stream-----");

        List<Employee> sortedList = employees.stream().sorted(Comparator.comparingDouble(employee -> employee.percentage)).collect(Collectors.toList());
        for(Employee e: sortedList){
            System.out.println(e.id + " : " +e.name + " : " + e.percentage);
        }

    }
}
