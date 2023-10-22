package org.Java.Basic100Questions;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("-----Reverse a string-----");
        String str = "rtr";
        String reversedString = "";
        char ch[] = str.toCharArray();
        for(int i = 0;i < ch.length;i++){
        reversedString = ch[i] + reversedString;
        }
        System.out.println("reversedString : " + reversedString);
        if(str.equals(reversedString)){
            System.out.println("String is palindrome.");
        }
        else{
            System.out.println("Stirng is not a palindrome.");
        }
    }
}
