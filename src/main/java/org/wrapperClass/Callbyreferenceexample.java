package org.wrapperClass;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void changeValue(Person value) {
        value.name = "New Name";
    }

}

public class Callbyreferenceexample {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        p.changeValue(p);
        System.out.println(p.name);
        float x = 90.223454f;
    }
}
