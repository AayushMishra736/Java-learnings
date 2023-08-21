package org.polymorphism;

class Car{
    final void driving(){
        System.out.println("Final method driveing a car.");
    }
}

public class Javafinalmethod extends Car{

//    @Override
//    void driving(){//compile time error we cannot override method having final
//        System.out.println("Driving a car.");
//    }
//
//    public static void main(String[] args) {
//
//    }
}
