package org.exception.execptionHnadlingWthMethodOverriding;

class Superclass5{
    void method() throws Exception{
        throw new RuntimeException("Declared exception in parent class.");
    }
}

public class SuperClassdeclaresanexceptionandSubClassdeclareswithoutexception extends Superclass5{

    void method(){
        System.out.println("Subclass method");
    }

    public static void main(String[] args) throws Exception {
        Superclass5 se = new Superclass5();
        se.method();
    }
}
