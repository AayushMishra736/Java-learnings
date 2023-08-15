package org.inheritance;

interface Swimmer{
    void swim();
}

class Elephant{
    void eat(){
        System.out.println("elephant is eating..");
    }
}

class Fish extends Elephant implements Swimmer {
    @Override
    public void swim() {
        System.out.println("Fish is swimming..");
    }
}

class Flyingfish extends Fish{
    void fly(){
        System.out.println("Fish is flying...");
    }
}

public class Hybridinheritance {
    public static void main(String[] args) {
        Flyingfish fly = new Flyingfish();
        fly.fly();
        fly.eat();
        fly.swim();
    }
}
