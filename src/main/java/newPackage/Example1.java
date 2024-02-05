package newPackage;

public class Example1 {
    public static void main(String[] args) {
        int a[] = {15, 2, 4, 8, 9, 5, 10, 23};
        subArrayWithCurrentSum(a, 23, a.length);
    }

    private static void subArrayWithCurrentSum(int a[], int sum, int n) {
        int currentSum = a[0], start = 0, i;
        for (i = 1; i < n; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - a[start];
                start++;
            }
            if (currentSum == sum) {
                int p = i - 1;
                System.out.println("Value start from " + start + " and end at " + p);
            }
            if (i < n)
                currentSum = currentSum + a[i];
        }
    }
}
