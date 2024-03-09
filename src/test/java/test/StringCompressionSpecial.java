package test;

public class StringCompressionSpecial {
    public static void main(String[] args) {
        String str = "aaaAAab^B&bbc$cC%ca*aDdDd@bB";
        String st = removeSpecial(str);
        System.out.println(compressString(st));
    }

    public static String removeSpecial(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                s = s + str.charAt(i);
            }
        }
        return s;
    }

    public static String compressString(String s) {
        if (s.isEmpty()) {
            return "";  // Handle the case where the input string is empty
        }

        String ans = "";
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i - 1))) {
                count++;
            } else {
                ans = ans + s.charAt(i - 1) + count;
                count = 1;
            }
        }

        ans = ans + Character.toLowerCase(s.charAt(s.length() - 1)) + count;

        return ans;
    }
}
