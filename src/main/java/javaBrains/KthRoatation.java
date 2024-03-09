package javaBrains;

import java.util.Arrays;

public class KthRoatation {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6,7};
        int k=4;
        rotate(arr,k);

    }
    public static void rotate(int[]arr, int k) {
         k=k% arr.length;
        for (int i = 1; i <= k; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];

            }
            arr[0] = temp;


        }
        System.out.println(Arrays.toString(arr));
    }
}
