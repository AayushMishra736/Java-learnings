package org.polymorphism.Downcastingexample;

class Animal{

}

public class DowncastingexamplewithInstanceOf extends Animal {

    public static void method(Object obj){
    if(obj instanceof DowncastingexamplewithInstanceOf){
        DowncastingexamplewithInstanceOf dce = (DowncastingexamplewithInstanceOf) obj;
        System.out.println("Downcasting Performed.");
    }
    }

    public static void main(String[] args) {
    Animal ins = new DowncastingexamplewithInstanceOf();
    DowncastingexamplewithInstanceOf.method(ins);
    }

}
