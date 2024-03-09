package array.Subsequence;

public class LongestCommonSubsequenceLength {
    public static void main(String[] args) {
        String text1="abcde";
        String text2="ace";
        int i=0;
        int j=0;
        System.out.println(lcs(text1,text2,i,j));
    }
    public static int lcs(String text1, String text2,int i, int j) {
        if (i == text1.length() || j == text2.length()) {
            return 0;
        }
        if (text1.charAt(i) == text2.charAt(j)) {
            return 1 + lcs(text1, text2, i + 1, j + 1);
        } else {
            int f1 = lcs(text1, text2, i, j + 1);
            int f2 = lcs(text1, text2, i + 1, j);
            int ans = Math.max(f1, f2);
            return ans;
        }

    }

}
