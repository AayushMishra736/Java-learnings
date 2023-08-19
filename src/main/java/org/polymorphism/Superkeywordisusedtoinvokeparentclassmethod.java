package org.polymorphism;

class Parent1 {
    void parentMethod() {
        System.out.println("This method is from parent class");
    }
}

class Child1 extends Parent1 {
    void parentMethod() {
        System.out.println("This method is from parent class but in child class");
    }

    void method() {
        System.out.println("This method is from child class");
        super.parentMethod();
    }

}

public class Superkeywordisusedtoinvokeparentclassmethod {

    void method() {
        this.method();
        System.out.println("This method is from current class");
    }

    public static void main(String[] args) {
        Child1 c = new Child1();
        c.method();
        System.out.println("----This is parentMethod-----");
        c.parentMethod();
    }
}
