package array.Interview;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public static int findLongestConsecutiveSubsequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Traverse the sorted array to find the longest subsequence
        int longestSubsequenceLength = 1;
        int currentSubsequenceLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentSubsequenceLength++;
            } else if (arr[i] != arr[i - 1]) {
                currentSubsequenceLength = 1;
            }

            longestSubsequenceLength = Math.max(longestSubsequenceLength, currentSubsequenceLength);
        }

        return longestSubsequenceLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        int result = findLongestConsecutiveSubsequence(arr);
        System.out.println("Length of the longest consecutive subsequence: " + result);
    }
}
