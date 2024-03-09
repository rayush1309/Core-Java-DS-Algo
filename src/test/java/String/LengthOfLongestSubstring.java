package String;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println("lengthOfLongestSubstring(str) = " + lengthOfLongestSubstring(str));



    }
    public static  int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start index of the current substring

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                // If the character is already in the substring, update the start index
                // to the next index of the repeated character
                start = Math.max(map.get(ch) + 1, start);
            }

            // Update the last position of the character in the map
            map.put(ch, i);

            // Calculate the length of the current substring
            int currentLength = i - start + 1;

            // Update the maxLength if the current substring is longer
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;


    }

}
