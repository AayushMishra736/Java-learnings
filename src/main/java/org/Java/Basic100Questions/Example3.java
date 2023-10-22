package org.Java.Basic100Questions;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("------Program to print armstrong number------");
        int a = 153;
        int j = a;
        double arStrn = 0;
        int count = 0;
        while(a != 0){
            int temp = a % 10;
            count++;
            a = a/10;
        }
        while(j != 0){
            int temp = j%10;
            arStrn = arStrn + Math.pow(temp,count);
            j = j/10;
        }
        if(arStrn == a){
            System.out.println("Number is armstong number");
        }
        else{
            System.out.println("Number is not a armstong number");
        }
    }
}
