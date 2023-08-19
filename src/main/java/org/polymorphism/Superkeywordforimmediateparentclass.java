package org.polymorphism;

class Parent{
    String color = "red";
}

class Child extends Parent{
   String color = "yellow";
   void colorPrint(){
       System.out.println("Color from current class" + color);
       System.out.println("Color after this class" + this.color);
       System.out.println("Color after super class" + super.color);
   }
}

public class Superkeywordforimmediateparentclass {
    public static void main(String[] args) {
        Child c = new Child();
        c.colorPrint();
    }
}
