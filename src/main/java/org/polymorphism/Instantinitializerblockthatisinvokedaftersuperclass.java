package org.polymorphism;

class Bike {
    public Bike() {
        System.out.println("This is super class constructor");
    }
}


public class Instantinitializerblockthatisinvokedaftersuperclass extends Bike {
    public Instantinitializerblockthatisinvokedaftersuperclass() {
        super();
        System.out.println("This is constructor of instance initializer block");
    }

    {
        System.out.println("Launcing bikes...");
    }

    public static void main(String[] args) {
        Instantinitializerblockthatisinvokedaftersuperclass a1 = new Instantinitializerblockthatisinvokedaftersuperclass();
        Instantinitializerblockthatisinvokedaftersuperclass a2 = new Instantinitializerblockthatisinvokedaftersuperclass();
    }

}
