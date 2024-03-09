package array;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printSubarraySum(arr);
    }

    public static void printSubarraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0; // Reset sum for each new subarray
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println("Sum of subarray [" + i + ", " + j + "]: " + sum);
                totalSum += sum;
            }
        }
        System.out.println("Total Sum of all subarrays: " + totalSum);
    }
}
