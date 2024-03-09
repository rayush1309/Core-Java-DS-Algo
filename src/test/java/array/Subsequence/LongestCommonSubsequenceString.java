package array.Subsequence;

public class LongestCommonSubsequenceString {
    public static void main(String[] args) {
        String text1="abc";
        String text2="abc";
        int i=0;
        int j=0;
        System.out.println(lcs(text1,text2,i,j));
    }
    public static String lcs(String text1, String text2,int i, int j) {
        if (i == text1.length() || j == text2.length()) {
            return "";
        }
        if (text1.charAt(i) == text2.charAt(j)) {
            return text1.charAt(i) + lcs(text1, text2, i + 1, j + 1);
        } else {
            String s1 = lcs(text1, text2, i, j + 1);
            String s2 = lcs(text1, text2, i + 1, j);
           return (s1.length()>s2.length())?s1:s2;
        }

        }
}
