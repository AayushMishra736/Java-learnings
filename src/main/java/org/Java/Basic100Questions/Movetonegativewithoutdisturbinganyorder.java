package org.Java.Basic100Questions;

import java.util.Arrays;

public class Movetonegativewithoutdisturbinganyorder {
    public static void main(String[] args) {
        int[] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int length = a.length;
        moveToNegativeWithout(a, length);
    }

    private static void moveToNegativeWithout(int[] a, int length) {
        int b[] = new int[length];
        int left = 0;
        int right = length - 1;
        for (int i = 0; i < length; i++) {
            if (a[i] < 0) {
                b[right] = a[i];
                right--;
            } else {
                b[left] = a[i];
                left++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
