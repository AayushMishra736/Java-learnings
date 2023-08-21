package org.polymorphism;

class Truck{
    final int speedlimit;

    public Truck() {
        speedlimit = 100;
        System.out.println("speed limit is " + speedlimit);
    }
}

public class Initializeblankfinalvariable extends Truck{
    public static void main(String[] args) {
        Truck t = new Truck();
    }
}
