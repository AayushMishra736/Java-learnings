package org.Java.Basic100Questions;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        System.out.println("------Program to print multiply of two dimensional array----");
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter the size of an array : ");
        c = scanner.nextInt();
        d = scanner.nextInt();
        int first[][] = new int[c][d];
        int second[][] = new int[c][d];
        int sum[][] = new int[c][d];
        System.out.println("Enter the digits to form an first array :  ");
        for (a = 0; a < c; a++) {
            for (b = 0; b < d; b++) {
                first[a][b] = scanner.nextInt();
            }
        }
        System.out.println("Enter the digits to form an second array :  ");
        for (a = 0; a < c; a++) {
            for (b = 0; b < d; b++) {
                second[a][b] = scanner.nextInt();
            }
        }
        System.out.println("Printing an array after multiplication : ");
        for (a = 0; a < c; a++) {
            for (b = 0; b < d; b++) {
                sum[a][b] = first[a][b] * second[a][b];
            }
        }
        System.out.println("Program to print multiplication of an array : ");
        for (a = 0; a < c; a++) {
            for (b = 0; b < d; b++) {
                System.out.print(sum[a][b] + "   ");
            }
            System.out.println();
        }
    }
}
