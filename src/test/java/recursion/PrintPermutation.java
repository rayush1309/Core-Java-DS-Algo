package recursion;

public class PrintPermutation {
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        pp(str, ans);
    }
    public static void pp(String str, String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            String s=str.substring(0,i)+str.substring(i+1);
            pp(s,ans+ch);
        }

    }
}
