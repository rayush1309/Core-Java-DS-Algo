package array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 7};
        int[] arr2 = {3, 4, 9};
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from arr1 (if any)
        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        // Copy the remaining elements from arr2 (if any)
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
