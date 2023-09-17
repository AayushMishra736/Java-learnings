package org.string;

public class Stringmethod1 {
    public static void main(String[] args) {
        String str = " Final Match ";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.length());
        System.out.println(str.startsWith(" "));
        System.out.println(str.endsWith(" "));
        System.out.println(str.charAt(10));
        String s = new String("Aayush");
        String s2 = s.intern();
        System.out.println(s2);
        int a = 10;
        String s3 = String.valueOf(a);
        System.out.println(s3 + 10);
        String s4 = String.valueOf("aayush");
        System.out.println(s4);
        String s5="Java is a programming language. Java is a platform. Java is an Island.";
        String replacedString = s5.replace("Java","Python");
        System.out.println(replacedString);


    }
}
