package javaBrains;

import java.util.Arrays;

public class ArrayCopying {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];

        // Use System.arraycopy to copy elements from arr1 to arr2
        System.arraycopy(arr1, 0, arr2, 0, 2);

        // Print the content of arr2
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
