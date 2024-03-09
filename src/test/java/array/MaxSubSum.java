package array;

public class MaxSubSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        maximumSubSum(arr);
    }

    private static void maximumSubSum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <= arr.length; j++) {
                currSum = 0;
                for (int k = i; k < j; k++) {
                    currSum += arr[k];
                }
                System.out.println("Sum of subarray [" + i + ", " + (j) + "]: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxSum = " + maxSum);
    }
}
