package array;

public class maxSubSum_Kadanes {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        kadanesAlgo(arr);

    }

    private static void kadanesAlgo(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        int curr_sum=0;
        for (int i = 0; i < arr.length; i++) {
            curr_sum+=arr[i];
            if (curr_sum<0){
                curr_sum=0;
            }
            maxSum=Math.max(maxSum,curr_sum);

        }
        System.out.println("maxSum = " + maxSum);
    }
}
