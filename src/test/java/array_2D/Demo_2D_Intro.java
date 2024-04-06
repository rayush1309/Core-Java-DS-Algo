package array_2D;

public class Demo_2D_Intro {
    public static void main(String[] args) {
        // int [][]arr=null;// 2-D Array
        int [][]arr=new int [3][4];// allocating space
        //1st parameter i.e: {3} denoting the Rows
        // 2nd Parameters: i.e: {4}: denoting the columns.

        System.out.println(arr[1]);
        System.out.println(arr[2]);
        int [][]arr1=new int[2][];
        System.out.println(arr1[0]);
        System.out.println(arr);
        int [][]other =arr;

        System.out.println(other);
        // find ROW length of 2-D Array: arr.length
        System.out.println(arr.length);
        //column length
        System.out.println(arr[0].length);
        // arr[0,1,2,3]kisi ka lenghth se find kar skte hai



    }
}
