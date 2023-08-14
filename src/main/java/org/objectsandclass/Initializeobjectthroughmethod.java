package org.objectsandclass;

class Employee{
    int id;
    String name;
    void initilizeValue(int key,String value){
        id = key;
        name = value;
    }

    void display(){
        System.out.println(id + " " + name);
    }
}

public class Initializeobjectthroughmethod {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.initilizeValue(1,"Abhay");
        e.display();
    }
}
