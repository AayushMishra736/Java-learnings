package org.objectsandclass;

class Student{
    int id;
    String name;
}

public class Initializeobjectthroughreferencevariable {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.name = "Abhay";
        System.out.println(s.id + " " + s.name);
    }
}
