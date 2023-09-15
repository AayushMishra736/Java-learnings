package datastructure.basicprograms;

import java.util.Scanner;

public class compareTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String firstString = sc.nextLine();
        System.out.println();
        System.out.print("Enter second String : ");
        String secondString = sc.nextLine();
        if (firstString.compareTo(secondString) > 0) {
            System.out.println("String first is greater.");
        }
        else
            if(secondString.compareTo(firstString) > 0){
                System.out.println("Second string is greater.");
            }
            else{
                System.out.println(" Both are equal.");
            }
    }
}
