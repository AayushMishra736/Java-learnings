package datastructure.basicprograms;

import java.util.Scanner;

public class Oddevenprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit to check : ");
        int number = sc.nextInt();
        if(number % 2 ==0 ){
            System.out.println("Number is even number " + number);
        }
        else{
            System.out.println("Number is odd number " + number
            );
        }
    }
}
