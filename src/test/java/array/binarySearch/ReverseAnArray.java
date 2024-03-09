package array.binarySearch;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int [] nums={1,29,10,23,6,11};
        int [] result=reverse(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int [] reverse(int []nums ){
        int i=0;
        int j= nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
           i++;
           j--;
        }


        return nums;

    }
}
