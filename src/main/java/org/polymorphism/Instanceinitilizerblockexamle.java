package org.polymorphism;

public class Instanceinitilizerblockexamle {
    int speed;

    Instanceinitilizerblockexamle(){
        System.out.println("speed is " + speed);
    }

    {speed = 100;}

    public static void main(String[] args) {
        Instanceinitilizerblockexamle in = new Instanceinitilizerblockexamle();
        Instanceinitilizerblockexamle in2 = new Instanceinitilizerblockexamle();
    }
}
