package org.Java.Basic100Questions;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s2.compareTo(s4));
        System.out.println(s3.compareTo(s4));
        System.out.println("---How to use indexOf() in java Program----");
        String str = "Hello program to know the index";
        System.out.println(str.indexOf("to"));
        System.out.println("----How to replace string with another string in java Program----");
        System.out.println(str.replaceAll("to","*****"));
        String strArray[] = str.split("\\s");
        System.out.println(Arrays.toString(strArray));
    }
}
