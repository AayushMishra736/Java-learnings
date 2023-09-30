package org.collection.Map.Hashmap;

import java.util.NavigableMap;
import java.util.TreeMap;

class Employee{
    int Employee_id;
    String Employee_firstName;
    String Employee_lastName;
    int Employee_age;

    public Employee(int Employee_id,String Employee_firstName,String Employee_lastName,int Employee_age){
        this.Employee_id = Employee_id;
        this.Employee_firstName = Employee_firstName;
        this.Employee_lastName = Employee_lastName;
        this.Employee_age = Employee_age;
    }

}

public class Objecttreemap {
    public static void main(String[] args) {
    Employee e1 = new Employee(101,"firstName1","lastName1",23);
    Employee e2 = new Employee(102,"firstName2","lastName2",22);
    Employee e3 = new Employee(103,"firstName3","lastName3",21);
    Employee e4 = new Employee(104,"firstName4","lastName4",29);
    Employee e5 = new Employee(105,"firstName5","lastName5",26);

    NavigableMap<Integer,Employee> sortedSet = new TreeMap<Integer,Employee>();

    sortedSet.put(1,e1);
    sortedSet.put(2,e2);
    sortedSet.put(3,e3);
    sortedSet.put(4,e4);
    sortedSet.put(5,e5);

    System.out.println(sortedSet.floorKey(3));
    System.out.println("Headmap key " + sortedSet.headMap(2,true));
    System.out.println("Tailemap key " + sortedSet.tailMap(2,true));
    System.out.println("Sub Map key " + sortedSet.subMap(2,true,4,true));
    }
}
