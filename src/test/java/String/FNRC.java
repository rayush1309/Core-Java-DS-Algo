package String;

import java.util.HashMap;
import java.util.Map;

public class FNRC {
    public static void main(String[] args) {
        String str = "racecars";
        System.out.println("firstNonRepeatingCharcter(str) = " + firstNonRepeatingCharcter(str));
    }

    public static char firstNonRepeatingCharcter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                return ch;  // Return the character, not the index
            }
        }
        return '-';  // Return a character '-' instead of new char '-1'
    }
}
