package org.Java8.Methodreference;

interface Sayable {
    void Say();
}


public class Methodreferncetoanstaticmethod {

    public static void saySomething(){
        System.out.println("This is static method.");
    }

    public static void main(String[] args) {

        Sayable sayable = Methodreferncetoanstaticmethod::saySomething;
        sayable.Say();
    }

}
