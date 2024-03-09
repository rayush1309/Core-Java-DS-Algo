package Ds.ArrayQPS;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int [] arr={2,11,5,10,7,8};
        int i=0;
        int j=arr.length-1;
       int [] ans= reverseArray(arr,i,j);
        System.out.println(Arrays.toString(ans));
    }
    public static int [] reverseArray(int [] arr, int i, int j){
        while (i<j){
            int temp=arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
           j--;
        }

        return arr;

    }
}
