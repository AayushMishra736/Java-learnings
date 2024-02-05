package newPackage;

public class MinMaxOfAnArray {
    public static void main(String[] args) {
        int a[] = {15, 2, 4, 8, 9, 5, 10, 23};
        minManOfAnArray(a, a.length);
    }

    private static void minManOfAnArray(int[] a, int length) {
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Max is " + max + " Min is " + min);
    }
}
