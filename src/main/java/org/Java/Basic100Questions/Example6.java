package org.Java.Basic100Questions;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        System.out.println("------Add Two Matrix Program In Java-----");
        int m, n, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix : ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix : ");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                first[c][d] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix : ");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                second[c][d] = scanner.nextInt();
            }
        }

        System.out.println("Sum of two matrix is : ");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                sum[c][d] = first[c][d] + second[c][d];
            }
        }

        System.out.println("Print sum of two 2d array : ");
        for(c = 0;c < m;c++){
            for(d = 0;d < n;d++){
                System.out.print(sum[c][d] + " ");
            }
            System.out.println();
        }
    }
}
