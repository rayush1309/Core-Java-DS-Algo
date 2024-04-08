package DSAFoundations.Arrays;

import java.util.Arrays;

public class ReverseGivenpartOfAnArray {
    public static void main(String[] args) {
        int [] arr={10,0,3,11,20};
        int startIdx=0;
        int endIdx=4;
        revereseInRange(arr,startIdx,endIdx);
        System.out.println(Arrays.toString(arr));

    }
    public static void revereseInRange(int [] arr, int startIdx, int endIdx){
        int i=startIdx;
        int j=endIdx;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
