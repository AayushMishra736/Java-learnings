package org.Java.Basic100Questions;

public class Example9 {
    public static void main(String[] args) {
        System.out.println("Difference between static and instance method : ");
        staticMethod();
        Example9 example9 = new Example9();
        example9.instanceMethod();
        example9.anotherMethod();
    }
    void anotherMethod(){
        staticMethod();
        instanceMethod();
    }
    static void staticMethod(){
        System.out.println("Calling static method...");
    }
    void instanceMethod(){
        System.out.println("Calling instance method...");
    }
}
