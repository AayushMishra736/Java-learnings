package org.polymorphism;

class Animal{
    void eat(){
        System.out.println("This is animal class");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("This is dog class");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("This is cat class");
    }

}

public class Runtimepolymorphismwithmultilevelinheritance {
    public static void main(String[] args) {
        Animal a1,a2,a3;
        a1 = new Animal();
        a1.eat();

        a2 = new Dog();
        a2.eat();

        a3 = new Cat();
        a3.eat();
    }

}
