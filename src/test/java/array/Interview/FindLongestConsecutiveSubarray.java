package array.Interview;

import java.util.Arrays;

public class FindLongestConsecutiveSubarray {
        public static void main(String[] args) {
            int [] arr={1,2,3,4,5,1,2,3,4,5,6,7,8,9,2,3,4,45,56,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71};
            int [] op=findLongest(arr);
            System.out.println(Arrays.toString(op));


        }
        public static int [] findLongest(int [] arr){
            int curr=0;
            int longest=1;
            int end=0;
            for (int i = 1; i < arr.length ; i++) {
                if (arr[i]==arr[i-1]+1){
                    curr++;
                } else if (arr[i]!=arr[i-1]+1) {
                    curr=1;

                }
                if (curr>longest){
                    longest=curr;
                    end=i;
                }

            }
            int start=end-longest+1;
            int [] res=new int [longest];
            for (int j=0;j< res.length;j++){
                res[j]=arr[start+j];
            }
            return res;


        }
    }

