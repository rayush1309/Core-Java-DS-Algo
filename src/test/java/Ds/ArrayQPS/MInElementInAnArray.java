package Ds.ArrayQPS;

public class MInElementInAnArray {
    public static void main(String[] args) {
        int [] arr={5,9,3,15,10,2};
        System.out.println(minElemnets(arr));


    }
    public static int minElemnets(int [] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }

        }
        return min;
    }
}
