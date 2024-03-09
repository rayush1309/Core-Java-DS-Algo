package array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] arr={8,1,0,2,1,0,3};
        moveZerosToTheRight(arr);

    }
    public static void moveZerosToTheRight(int[] arr){
        int j=0;// focus on zeroth Element
        for (int i = 0; i < arr.length; i++) { // i focus on non zero ELement
            if (arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if (arr[j]!=0){
                j++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
