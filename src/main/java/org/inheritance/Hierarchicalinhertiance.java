package org.inheritance;

class Roadway{
    void road(){
        System.out.println("Transport medium is roadway's.");
    }
}

class Bike extends Roadway{
    void bike(){
        System.out.println("Bike is running..");
    }
}

class Car extends Roadway{
    void car(){
        System.out.println("Car is running..");
    }
}

public class Hierarchicalinhertiance {
    public static void main(String[] args) {
        Car car = new Car();
        car.car();
        car.road();
    }
}
