package datastructure.basicprograms;

public class subArrayWithGivenSum {
    public static void main(String[] args) {
        int a[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        subArraySum(a, a.length, sum);
    }

    public static int subArraySum(int a[], int n, int sum) {
        int currentSum = a[0],i = 0,start = 0;
        for(i = 1;i < n;i++){
         while(currentSum > sum && start < i -1){
             currentSum = currentSum + a[i];
             return 1;
         }



        }
        System.out.println("No Subarray Found");
        return 0;
    }
}
