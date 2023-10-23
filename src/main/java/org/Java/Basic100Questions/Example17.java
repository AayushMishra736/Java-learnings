package org.Java.Basic100Questions;

import java.util.Arrays;

public class Example17 {
    public static void main(String[] args) {
        System.out.println("----Program of selection sort---");
        int a[] = {2, 3, 6, 7, 9, 12, 45, 6, 8, 9};
        selectionSortMethod(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSortMethod(int[] a, int length) {
       for(int i = 0;i < length;i++){
           int min_index = i;
           for(int j = i + 1;j < length;j++){
               if(a[j] < a[min_index]){
                   min_index = j;
               }
               int temp = a[min_index];
               a[min_index] = a[i];
               a[i] = temp;
           }
       }
    }
}
