package org.Java.Basic100Questions;

public class Example13 {
    public static void main(String[] args) {
        System.out.println("Linear search of a program.");
        int a[] = {2, 3, 6, 7, 9, 12, 45, 6, 8, 9};
        int k = 45;
        int n = Linearsearch(a, k);
        System.out.println(n);
    }

    private static int Linearsearch(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
