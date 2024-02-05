package newPackage;

import java.util.Arrays;

public class Moveallelementtooneside {

    public static void main(String[] args) {
        int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveElementToOneSide(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void moveElementToOneSide(int[] a, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
    }
}
