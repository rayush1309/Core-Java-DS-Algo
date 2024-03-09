package test772.test772;

import java.util.Arrays;

public class secondMax {
    public static void main(String[] args) {
       int [] arr={10,20,3,4,10,9,13,20,18,23,98};
        Arrays.sort(arr);
       int sm=arr[arr.length-1];
        for(int j=arr.length-1;j>=0;j--){
            if (sm>arr[j]){
                sm=arr[j];
                break;
            }

        }
        System.out.println(sm);
    }
}
//complexity of O(n log n) and a space complexity of O(n).
