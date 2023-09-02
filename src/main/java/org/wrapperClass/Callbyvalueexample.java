package org.wrapperClass;



public class Callbyvalueexample {

    static void callByValueMethod(int x){
        x = x + 10;
        System.out.println("Final value of x is : " + x);
    }

    public static void main(String[] args) {
    int value = 10;
    callByValueMethod(value);
    }
}
