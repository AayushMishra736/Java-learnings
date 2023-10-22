package org.Java.Basic100Questions;

import java.util.Arrays;

public class Example14 {
    public static void main(String[] args) {
        System.out.println("Binary search of a programa applicable for sorted array.");
        int a[] = {2, 3, 6, 7, 9, 12, 45, 6, 8, 9};
        Arrays.sort(a);
        int k = 45;
        int result = binarySearchMethod(a, k);
        System.out.println("Result is : " + result);
    }

    private static int binarySearchMethod(int a[], int k) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int mid = l + (h - 1) / 2;

            if (a[mid] == k)
                return mid;

            if (k < a[mid])
                h = mid - 1;

            else
                l = mid + 1;
        }
        return -1;
    }
}
