package array;

import java.util.Arrays;

public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        int [] arr={2,0,2,2,0,1,1};
        int i=0;
        int j=0;
        int k= arr.length-1;
        while (i<=k){
            if (arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            } else if (arr[i]==1) {
                i++;

            }else if (arr[i]==2){
                swap(arr,i,k);
                k--;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
    public static void swap( int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
