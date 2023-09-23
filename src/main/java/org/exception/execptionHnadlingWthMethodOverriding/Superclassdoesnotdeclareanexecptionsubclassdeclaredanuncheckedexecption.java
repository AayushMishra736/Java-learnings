package org.exception.execptionHnadlingWthMethodOverriding;

class Superclass2 {
    void method() {
        System.out.println("Example when super class does not declare an execption and child class declare unchecked execption.");
    }
}

public class Superclassdoesnotdeclareanexecptionsubclassdeclaredanuncheckedexecption extends Superclass2 {

    void method() throws ArithmeticException {
        int d = 50 / 0;
        System.out.println(d);
    }

    public static void main(String[] args) {
        Superclassdoesnotdeclareanexecptionsubclassdeclaredanuncheckedexecption se = new Superclassdoesnotdeclareanexecptionsubclassdeclaredanuncheckedexecption();
        se.method();
    }
}
