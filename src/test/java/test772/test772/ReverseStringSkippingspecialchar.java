package test772.test772;

public class ReverseStringSkippingspecialchar {
    public static void main(String[] args) {
        String str="fhhfgf%44f^";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        String ans="";
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                ans=str.charAt(i)+ans;
            }

        }
        return ans;
    }
}
