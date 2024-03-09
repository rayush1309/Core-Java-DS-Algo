package array.Interview;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int result = lengthOfLIS(arr);
        System.out.println("Length of the Longest Increasing Subsequence: " + result);
    }

    public static int lengthOfLIS(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int n = arr.length;
        return lengthOfLISRecursive(arr, n, Integer.MIN_VALUE,0);
    }

    private static int lengthOfLISRecursive(int[] arr, int n, int prevElement, int currentIndex) {
        if (currentIndex == n) {
            return 0;
        }

        // Exclude the current element
        int excludeCurrent = lengthOfLISRecursive(arr, n, prevElement, currentIndex + 1);

        // Include the current element if it is greater than the previous element
        int includeCurrent = 0;
        if (arr[currentIndex] > prevElement) {
            includeCurrent = 1 + lengthOfLISRecursive(arr, n, arr[currentIndex], currentIndex + 1);
        }

        // Return the maximum of including and excluding the current element
        return Math.max(includeCurrent, excludeCurrent);
    }
}
