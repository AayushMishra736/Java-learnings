package newPackage;

public class subArrayWithgivenSum {
    public static void main(String[] args) {
        int a[] = {1, 4, 20, 3, 10, 5};
        int sum = 23;
        subArraySum(a, a.length, sum);
    }

    private static void subArraySum(int[] a, int n, int sum) {
        int currentSum = a[0], start = 0, i;
        for (i = 1; i < n; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - a[start];
                start++;
            }
            if (currentSum == sum) {
                int p = i - 1;
                System.out.println("Sum of an subarray occurred at  start :" + start + " : end " + i);
            }
            if (i < n) {
                currentSum = currentSum + a[i];
            }
        }
    }
}
