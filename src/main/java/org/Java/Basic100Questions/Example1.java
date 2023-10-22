package org.Java.Basic100Questions;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("----Print reverse number in java----");
        int i = 1234;
        int j = 0;
        while(i != 0){
         int temp = i % 10;
         j = j*10 + temp;
         i = i / 10;
        }
        System.out.println("Reversed value is : " + j);
        if(i == j){
            System.out.println("It is palindrome..");
        }
        else{
            System.out.println("Not a palindrome..");
        }
        System.out.println("Print all alphabet in java !!");
        char ch = 'a';
        for(;ch <= 'z';ch++){
            System.out.print(ch + " , ");
        }
    }
}
