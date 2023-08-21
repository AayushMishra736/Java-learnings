package org.polymorphism;

public class Staticbindingclass {

    private void run(){
        System.out.println("inside the running method....");
    }
    public static void main(String[] args) {
        Staticbindingclass s = new Staticbindingclass();
        s.run();
    }

}
