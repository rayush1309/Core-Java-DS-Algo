package array.Subsequence;

public class GenerateSubsequence {
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        printSubseq(str,ans);
    }
    public static void printSubseq(String str,String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        printSubseq(str.substring(1), ans);
        printSubseq(str.substring(1), ans+ch);


    }
}
