package datastructure.basicprograms;

import java.util.Arrays;

public class sortAnArray {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int length = arr.length;
        sortOnTheBasisOf012(arr,length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortOnTheBasisOf012(int[] a, int n) {
     int lo = 0,mid = 0,temp = 0;
     int high = n - 1;
     while(mid <= high){
     switch (a[mid]){
         case 0: {
             temp = a[lo];
             a[lo] = a[mid];
             a[mid] = temp;
             lo++;
             mid++;
             break;
         }
         case 1:{
             mid++;
             break;
         }
         case 2: {
             temp = a[mid];
             a[high] = a[mid];
             a[mid] = temp;
             high--;
             break;
         }
       }
     }
    }
}
