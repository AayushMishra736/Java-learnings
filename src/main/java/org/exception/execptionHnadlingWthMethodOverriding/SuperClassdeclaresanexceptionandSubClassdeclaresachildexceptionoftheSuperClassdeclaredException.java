package org.exception.execptionHnadlingWthMethodOverriding;

class Superclass4 extends Exception{

    void method() throws Exception{
        int a = 50/0;
        System.out.println("Value of a" + a);
    }

}

public class SuperClassdeclaresanexceptionandSubClassdeclaresachildexceptionoftheSuperClassdeclaredException extends Superclass4{

    void method() throws ArithmeticException{
        System.out.println("Throwing ArithmeticException.");
    }

    public static void main(String[] args) {
        SuperClassdeclaresanexceptionandSubClassdeclaresachildexceptionoftheSuperClassdeclaredException se = new SuperClassdeclaresanexceptionandSubClassdeclaresachildexceptionoftheSuperClassdeclaredException();
        se.method();
    }
}
