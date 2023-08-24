package org.polymorphism.Downcastingexample;

class Book{

}

public class Downcastingwithoutuseofinstanceof extends Book{

    private static void method(Book b){
    Downcastingwithoutuseofinstanceof use = (Downcastingwithoutuseofinstanceof) b;
    System.out.println("ok downcasting performed");
    }

    public static void main(String[] args) {

        Book dwn = new Downcastingwithoutuseofinstanceof();
        Downcastingwithoutuseofinstanceof.method(dwn);
    }

}
