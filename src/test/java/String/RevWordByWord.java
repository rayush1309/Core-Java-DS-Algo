package String;

public class RevWordByWord {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        String ans = "";

        for (char ch : str.toCharArray()) {
            if (ch != '.') {
                ans += ch;
            } else {
                ans = reverse(ans);
                System.out.print(ans + ".");
                ans = "";
            }
        }

        // Print the reversed last word
        System.out.print(reverse(ans));
    }

    public static String reverse(String s) {
        String str = "";
        for (int j = 0; j < s.length(); j++) {
            str = s.charAt(j) + str;
        }
        return str;
    }
}
