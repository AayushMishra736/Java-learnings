package newPackage;

import java.util.Arrays;

public class Reverseaarray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int b[] = {0, 2, 1, 0, 1, 2, 0, 2, 1};
        reverseArray(a, a.length);
        System.out.println(Arrays.toString(a));
        sort012(b);
        System.out.println(Arrays.toString(b));
    }

    private static void sort012(int[] a) {
        int low = 0, high = a.length - 1, temp = 0, mid = 0;
        while (mid <= high) {
            switch (a[mid]) {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    private static void reverseArray(int[] a, int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
