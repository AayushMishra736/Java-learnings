package newPackage;

import java.util.HashSet;

public class UnionandintersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6, 7, 8, 9, 10, 45};
        int b[] = {1, 6, 9, 45, 2, 3};
        intersection(a, b);
        union(a, b);
    }

    private static void union(int[] a, int[] b) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
                hashSet.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
                hashSet.add(b[i]);
        }

        System.out.println(hashSet);
    }

    private static void intersection(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println("The intersection is : " + a[i]);
                }
            }
        }
    }

}
