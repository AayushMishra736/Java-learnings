package org.Java.Basic100Questions;

import java.util.Arrays;

public class Example15 {
    public static void main(String[] args) {
        System.out.println("Insertion sort for sorting an array.");
        int a[] = {2, 3, 6, 7, 9, 12, 45, 6, 8, 9};
        insertionSortMethod(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void insertionSortMethod(int[] a, int length) {
       for(int i = 0;i < length;i++){
           int key = a[i];
           int j = i - 1;
           while(j >= 0 && a[j] > key){
               a[j + 1] = a[j];
               j = j - 1;
           }
           a[j + 1] = key;
       }
    }
}
