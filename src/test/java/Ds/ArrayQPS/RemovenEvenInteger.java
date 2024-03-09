package Ds.ArrayQPS;

import java.util.Arrays;

public class RemovenEvenInteger {
    public static void main(String[] args) {
        int [] arr={3,2,4,7,10,6,5};
        System.out.println(Arrays.toString(ansArray(arr)));


    }
    public static int [] ansArray(int [] arr){
        int oddCount=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2!=0){
                oddCount++;
            }

        }
        int [] ans= new int[oddCount];
        int idx=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                ans[idx]=arr[i];
                idx++;

            }

        }
        return ans;
    }
}
//time complexity of O(n) and a space complexity of O(n).