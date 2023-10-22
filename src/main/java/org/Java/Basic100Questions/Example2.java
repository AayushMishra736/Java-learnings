package org.Java.Basic100Questions;


public class Example2 {
    public static void main(String[] args) {
        System.out.println("------Prime number program in java------");
        int value = 11;
        boolean flag = false;
        for(int i = 2;i < value;i++){
         if(value / i == 0){
             flag = true;
             break;
         }
        }
        if(flag){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
