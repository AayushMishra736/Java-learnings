package org.Java.Basic100Questions;

import java.util.Arrays;

public class Example16 {
    public static void main(String[] args) {
        System.out.println("Bubble sort...");
        int a[] = {2, 3, 6, 7, 9, 12, 45, 6, 8, 9};
        bubbleSortMethod(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSortMethod(int[] a, int length) {
        for(int i = 0;i < length;i++){
            for(int j = 1;j < length - i;j++){
                if(a[j - 1] > a[j]){
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}
