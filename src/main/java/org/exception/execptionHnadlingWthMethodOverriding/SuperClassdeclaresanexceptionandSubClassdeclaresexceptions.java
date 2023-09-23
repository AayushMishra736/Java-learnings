package org.exception.execptionHnadlingWthMethodOverriding;

class Superclass3 {
    void method() throws RuntimeException {
        int a = 56 / 0;
        System.out.println(a);
    }
}

public class SuperClassdeclaresanexceptionandSubClassdeclaresexceptions extends Superclass3 {
    // Exception is not a child exception
    // of the RuntimeException
    // So the compiler will give an error
//    void method() throws Exception {
//        System.out.println("Superclass3");
//    }

    public static void main(String[] args) throws Exception {
        SuperClassdeclaresanexceptionandSubClassdeclaresexceptions se = new SuperClassdeclaresanexceptionandSubClassdeclaresexceptions();
        se.method();
    }
}
