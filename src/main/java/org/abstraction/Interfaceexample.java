package org.abstraction;

interface Printable{
    abstract void print();
    static void message(){
        System.out.println("This is static method in printable interface");
    };

    default void printableStaticMethod(){
        System.out.println("This is deafult method in printable interface.");
    }
}


public class Interfaceexample implements Printable{

    @Override
    public void print() {
        System.out.println("Method overriding from printable interface.");
    }

    public static void main(String[] args) {
        Printable p = new Interfaceexample();
        p.print();
        p.printableStaticMethod();
        Printable.message();
    }

}
