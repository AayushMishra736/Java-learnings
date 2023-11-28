package datastructure.basicprograms;

import java.util.Arrays;

public class SortOddEven {
    public static void main(String[] args) {
        int[] a = {10,23,46,41,87,99,22};
        sortArrray(a,a.length);
    }

    private static void sortArrray(int[] a, int n) {
        int b[] = new int[n];
        int mid = n /2;
        int j = 0;
        for(int i = 0;i < a.length;i++){
            if(a[i] % 2 == 0  && i < mid){
                b[j] = a[i];
                j++;
            }
            else{
                b[mid] = a[i];
                mid++;
            }

        }
        System.out.println(Arrays.toString(b));
    }
}
