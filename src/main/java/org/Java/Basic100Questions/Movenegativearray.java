package org.Java.Basic100Questions;

import java.util.Arrays;

public class Movenegativearray {
    public static void main(String[] args) {
        int[] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int length = a.length;
        moveToNegativeWithArray(a, length);
    }

    private static void moveToNegativeWithArray(int[] a, int length) {
        int b[] = new int[length];
        int c[] = new int[length];
        int j = 0;
        int k = 0;
        for(int i = 0;i < length;i++){
            if(a[i] < 0){
                b[j] = a[i];
                j++;
            }
            else {
                c[k] = a[i];
                k++;
            }
        }

        for(int l = 0;l < k;l++){
            if(j > l){
                b[j] = c[l];
                j++;
            }
        }

        System.out.println(Arrays.toString(b));
    }
}
