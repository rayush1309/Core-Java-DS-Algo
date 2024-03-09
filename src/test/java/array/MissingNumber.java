package array;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={1,3,6,8,2,4,7};
        System.out.println("findMissingNumber(arr) = " + findMissingNumber(arr));


    }
    public static int findMissingNumber(int [] arr){
        int n= arr.length+1;
        //To know the last number , as one number is missing so  to know length(highest range) me +1
        int sum =n*(n+1)/2;
        for (int num:arr){
            sum=sum-num;
        }
        return sum;





    }
}
