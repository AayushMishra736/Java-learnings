package org.createObject;

class Person{
    int id;
    String name;

    public Person(int id, String name){
    this.id = id;
    this.name = name;
    }

}


public class byNewKeyword {
    public static void main(String[] args) {
        Person person1 = new Person(30,"Alice");
        Person person2 = new Person(25,"Bob");
        System.out.println(person2.id + person2.name);
        System.out.println(person1.id + person1.name);
    }
}
