package org.basic;

public class Classloaderexample {
    public static void main(String[] args) {
        Class cs = Classloaderexample.class;
        System.out.println(cs.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
}
