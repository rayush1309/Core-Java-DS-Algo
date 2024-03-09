package javaBrains;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6,7};
        int i=0;
        int j= arr.length-1;
        reverse(arr,i,j);

    }
    public static void reverse(int [] arr,int i,int j ){
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
