package org.Java8;

interface Interface1{
    public default void defaultMethod(){
        System.out.println("This is default method.");
    }
    static void staticMethod(){
        System.out.println("This is static method.");
    }

}

class Middleclass implements Interface1{
    @Override
    public void defaultMethod(){
        System.out.println("Override default method..");
    }

}


public class Defaultstaticimplementation{

    public static void main(String[] args) {
        Middleclass interface1  = new Middleclass();
        interface1.defaultMethod();

        Interface1.staticMethod();
    }
}
