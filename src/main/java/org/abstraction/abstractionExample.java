package org.abstraction;

import java.sql.SQLOutput;

abstract class Shape{

    public Shape(){
        System.out.println("This is constructor of abstract class");
    }

    abstract void method();

    void secondMethod(){
        System.out.println("This is second method of abstract class");
    }

}

class Rectangle extends Shape{

    @Override
    void method() {
        System.out.println("This method is from shape but extends in rectangle shape.");
    }
}
public class abstractionExample {
    public static void main(String[] args) {
        Shape rec = new Rectangle();
        rec.method();
        rec.secondMethod();
    }
}
