package org.polymorphism;

public class Whichwillinvokefirstblockorconstructor {

    public Whichwillinvokefirstblockorconstructor(){
        System.out.println("This is constructor block.");
    }

    {
        System.out.println("This is instant initilizar block");
    }

    public static void main(String[] args) {
        Whichwillinvokefirstblockorconstructor a1 = new Whichwillinvokefirstblockorconstructor();
        Whichwillinvokefirstblockorconstructor a2 = new Whichwillinvokefirstblockorconstructor();
    }

}
