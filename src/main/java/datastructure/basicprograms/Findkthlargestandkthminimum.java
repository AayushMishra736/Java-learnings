package datastructure.basicprograms;

public class Findkthlargestandkthminimum {
    public static void main(String[] args) {
        int arr[] = {10, 40, 50, 30, 19, 33};
        int k = 3;
        if (k <= arr.length) {
            System.out.print("Kth smallest element is " + kthSmallest(arr, k));
        } else {
            System.out.println("Size exceed...........");
        }
    }

    private static int kthSmallest(int[] a, int k) {
        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            l = Math.min(l, a[i]);
            h = Math.max(h, a[i]);
        }
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (count(a, mid) < k) {
                l = mid + 1;
            }
            else
                h = mid;
        }
        return l;
    }

    private static int count(int[] a, int k) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= k)
                cnt++;
        }
        return cnt;
    }

}
