package datastructure.basicprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverseanarray {
    public static void main(String[] args) {
        int a[] = {34,2,3,6,7,8,9,10,23,4};
        reverseAnArray(a);
        System.out.println(Arrays.toString(a));
    }
    private static void reverseAnArray(int[] a) {
        int m = 0;
        int h = a.length - 1;
        while(m < h){
        int temp = a[m];
        a[m] = a[h];
        a[h] = temp;
        m++;
        h--;
        }
    }
}
