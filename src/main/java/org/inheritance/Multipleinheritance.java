package org.inheritance;

interface Ship {
    void ship();
}

interface Submarine {
    void submarine();
}

class Seaways implements Ship,Submarine{

    @Override
    public void ship() {
        System.out.println("Ship is floating on water.");
    }

    @Override
    public void submarine() {
        System.out.println("Submarine is floating on water.");
    }
}

public class Multipleinheritance extends Seaways{

    public static void main(String[] args) {
    Seaways sea = new Seaways();
    sea.ship();
    sea.submarine();
    }
}
