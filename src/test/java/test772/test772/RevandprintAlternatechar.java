package test772.test772;

import java.util.Arrays;

public class RevandprintAlternatechar {
    public static void main(String[] args) {
        String str="Thank you";
        print(str);
    }
    public static void print(String str){
        String ans="";
        for (int i=0;i<str.length();i++){
            ans=str.charAt(i)+ans;
        }
         String x=ans;
        for (int i = 0; i < x.length(); i=i+2) {
            System.out.print(Character.toLowerCase(x.charAt(i))+" ");


        }


    }
}
