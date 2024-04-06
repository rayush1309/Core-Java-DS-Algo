package array_2D;

import java.util.Scanner;

public class Demo_2D_ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//row
        int m=sc.nextInt();//col
        int[][]arr=new int [n][m];
        //System.out.println(arr[2][2]); //0 o/p
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                arr[i][j]=sc.nextInt();

            }
        }
        //print
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();//jaise hi ek 1-D Array print ho line change
        }



    }
}
