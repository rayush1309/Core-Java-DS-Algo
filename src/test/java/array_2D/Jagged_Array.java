package array_2D;

import java.util.Scanner;

public class Jagged_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//row
        int [][]arr=new int [n][];//col size we will not defined
        for(int i=0;i<arr.length;i++) {// loop on row
            int col=sc.nextInt();//column
            arr[i]=new int[col];
            for(int j=0;j<arr[i].length;j++) {     // arr[i];bcz har row me col ka length diff ho skta hai
                arr[i][j]=sc.nextInt();

            }

        }
        // print
        for(int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
