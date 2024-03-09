package array.Subsequence;

import java.util.Arrays;

public class LogestConsecutiveSubsequence {
    public static void main(String[] args) {
        int [] arr={100,4,200,1,3,2};
        System.out.println(lcsLength(arr));
    }
    public static int lcsLength(int [] arr){
        if (arr == null || arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int lcs=1;
        int currenLenth=1;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i+1]==arr[i]+1){
                currenLenth++;
            }else {
                currenLenth=1;
            }
            lcs= Math.max(lcs,currenLenth);

        }
        return lcs;
    }
}
