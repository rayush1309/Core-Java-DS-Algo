package array.Subsequence;

import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int n= arr.length;
        int currentIdx=0;
        int prevElement=Integer.MIN_VALUE;
        System.out.println(LisLength(arr,n,prevElement,currentIdx));

    }
    public static  int LisLength(int [] arr,int n,int prevElement, int currentIdx ){
        if (currentIdx==n){
            return 0;
        }
        //Exclude
        int ex=LisLength(arr,n,prevElement,currentIdx+1);
        //include
        int in=0;
        if (arr[currentIdx]>prevElement){
            in= 1+ LisLength(arr,n,arr[currentIdx],currentIdx+1 );
        }
        return Math.max(in,ex);
    }
}
