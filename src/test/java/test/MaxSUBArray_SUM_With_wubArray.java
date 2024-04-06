package test;

public class MaxSUBArray_SUM_With_wubArray {
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int [] arr= {-2,-3};
        printMaxSubArray(arr);
    }

    public static void printMaxSubArray(int[] arr) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
                start = s;
                end = i;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
                s = i + 1;
            }
        }

        System.out.println("Maximum contiguous sum is " + max_sum);
        System.out.print("Subarray with the maximum sum is: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
