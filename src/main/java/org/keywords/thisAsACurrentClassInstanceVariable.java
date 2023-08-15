package org.keywords;

class Employee{
    int id;
    String name;

    public Employee(int id,String name){
        this.id = id;
        this.name = name;
    }

}

public class thisAsACurrentClassInstanceVariable {

    public static void main(String[] args) {
        Employee e = new Employee(101,"Abhay");
        System.out.println(e.id + " " + e.name);
    }
}
