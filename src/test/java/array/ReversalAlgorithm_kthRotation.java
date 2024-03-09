package array;

import java.util.Arrays;

public class ReversalAlgorithm_kthRotation {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6,7};
        int k=4;
      int [] ans =rotateArray(arr, k);
        System.out.println(Arrays.toString(ans));

    }
    public static int [] rotateArray(int[]arr,int k) {
        k=k%arr.length;
        int n=arr.length;
        reverse(arr, 0, n-k-1);// 1st n-k element reverse
        reverse(arr, n-k, n-1);// last k elemet reverse
        reverse(arr, 0, n-1);// entire Array reverse
        return  arr;


    }
    public static void reverse(int []arr, int i, int j) {

        while(i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
