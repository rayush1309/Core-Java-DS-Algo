package practice;

public class test1 {
    public static void main(String[] args) {
        String str = "abcb#%?yu2";
        printSpecialCharacters(str);

    }

    public static void printSpecialCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)||Character.isDigit(ch)) {
                // Skip consecutive letter characters
                while (i < str.length() - 1 && Character.isLetter(str.charAt(i + 1))) {
                    i++;
                }
            } else {
                // Print special character
                System.out.println(ch);
            }
        }
    }
}
