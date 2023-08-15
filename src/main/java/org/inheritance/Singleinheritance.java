package org.inheritance;

class Animal{
    void animal(){
        System.out.println("This is animal class");
    }
}

class Dog extends Animal{
    void dog(){
        System.out.println("This is dod class");
    }
}

public class Singleinheritance {
    public static void main(String[] args) {
    Dog d = new Dog();
    d.dog();
    d.animal();
    }
}
