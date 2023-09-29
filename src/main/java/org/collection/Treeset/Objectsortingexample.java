package org.collection.Treeset;


import java.util.TreeSet;

class Employee implements Comparable<Employee> {

    int id;
    String firstName;
    String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int compareTo(Employee e) {
        if (id > e.id) {
            return 1;
        } else if (id < e.id) {
            return -1;
        } else {
            return 0;
        }
    }


}


public class Objectsortingexample {
    public static void main(String[] args) {
        Employee e1 = new Employee(111, "John", "Wick1");
        Employee e2 = new Employee(102, "Peter", "Wick2");
        Employee e3 = new Employee(113, "Ironman", "Wick3");
        Employee e4 = new Employee(104, "Hulk", "Wick4");

        TreeSet<Employee> set = new TreeSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        for (Employee e : set) {
            System.out.println(e.id + " " + e.firstName + " " + e.lastName);
        }

    }
}
