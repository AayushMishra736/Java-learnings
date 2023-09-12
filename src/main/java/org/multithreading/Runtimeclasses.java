package org.multithreading;

import java.io.IOException;

public class Runtimeclasses {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("notepad");
       // Runtime.getRuntime().exec("shutdown -s -t 0");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Free memory " + Runtime.getRuntime().freeMemory());
        System.out.println("Total memory " + Runtime.getRuntime().totalMemory());
        for(int i = 0;i < 1000;i++){
            new Runtimeclasses();
        }
        System.out.println("After Free memory " + Runtime.getRuntime().freeMemory());
        System.out.println("After otal memory " + Runtime.getRuntime().totalMemory());
    }
}
