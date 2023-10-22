package org.Java.Basic100Questions;

interface Info{
    final static String data = "Information about interface";
    void display();

}

public class Example10 implements Info{
    public static void main(String[] args) {
    Example10 example10 = new Example10();
    example10.display();
    System.out.println(data);
    }

    @Override
    public void display() {
        System.out.println("This is to display the information.");
    }
}
