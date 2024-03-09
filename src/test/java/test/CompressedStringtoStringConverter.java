package test;

public class CompressedStringtoStringConverter {
    public static void main(String[] args) {
        String str = "a3b3cde5";
        System.out.println(stringManipulation(str));
    }

    public static String stringManipulation(String str) {
            String ans = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    int num = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
                    for (int j = 0; j < num; j++) {
                        ans = ans + ch;
                    }
                    i++; // Skip the digit
                } else {
                    ans = ans + ch;
                }
            }

        return ans;
    }
}
