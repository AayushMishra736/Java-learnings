package org.Java.Basic100Questions;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example12 {
    public static void main(String[] args) throws IOException {
        System.out.println("Garbage collection in java : ");
        Runtime rs =  Runtime.getRuntime();
        System.out.println("Free up memorey : " + rs.freeMemory());
        rs.gc();
        System.out.println("Free up memorey : " + rs.freeMemory());
        System.out.println(InetAddress.getLocalHost());
        rs.exec("notepad");
    }
}
