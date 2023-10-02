package org.Java8.Lambdaexpression;

interface Drawable{
    void draw();
}

public class Noparameterexample {
    public static void main(String[] args) {
        int width = 10;
        Drawable d2 = ()->{
            System.out.println("Width of the object is : "+width);
        };
        d2.draw();
    }
}
