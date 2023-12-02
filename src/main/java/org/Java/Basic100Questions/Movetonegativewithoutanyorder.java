package org.Java.Basic100Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Movetonegativewithoutanyorder {
    public static void main(String[] args) {
        int[] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int length = a.length;
        moveToNegative(a, length);
    }

    private static void moveToNegative(int[] a, int length) {
        int start = 0;
        int i = 0;
        for (i = 0; i < length; i++) {
            if (a[i] < 0) {
                if (i != start) {
                    int temp = a[i];
                    a[i] = a[start];
                    a[start] = temp;
                }
                start++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
