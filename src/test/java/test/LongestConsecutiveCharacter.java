package test;

public class LongestConsecutiveCharacter {
    public static void main(String[] args) {
        String str = "aaaaabaaacdaa";
        findLCC(str);
    }

    public static void findLCC(String str) {
        char ans = '\0';
        int max = 0;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    ans = str.charAt(i-1);
                }
                count = 1;
            }
        }

        // Check for the last character sequence
        if (count > max) {
            max = count;
            ans = str.charAt(str.length() - 1);
        }

        System.out.println("Longest consecutive character: " + ans);
        System.out.println("Length of the sequence: " + max);
    }
}
