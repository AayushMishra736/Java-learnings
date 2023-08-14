package org.createObject;

class Employee implements Cloneable{

    int age;
    String name;

    public Employee(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

public class byCloneMethod {
    public static void main(String[] args) throws CloneNotSupportedException{

        Employee originalPerson = new Employee(11,"Alice");

        Employee clonedPerson = (Employee) originalPerson.clone();

        System.out.println("Original: " + originalPerson.name + " is " + originalPerson.age + " years old.");
        System.out.println("Clone: " + clonedPerson.name + " is " + clonedPerson.age + " years old.");

    }
}
