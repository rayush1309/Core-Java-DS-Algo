import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveCharacter {
    public static void main(String[] args) {
        String str = "bbbaaaaaAbbbbbbbbbba"; // Replace this with your actual string

        Map<Character, Integer> map = new HashMap<>();
        int maxCount = 0;
        char currentChar = '\0'; // Initialize currentChar with a default value
        int currentCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i > 0 && ch != str.charAt(i - 1)) {
                // Reset count for non-consecutive characters
                currentCount = 0;
            }

            currentCount++;
            map.put(ch, currentCount);

            if (currentCount > maxCount) {
                maxCount = currentCount;
                currentChar = ch;
            }
        }

        System.out.println("Character: " + currentChar);
        System.out.println("Count: " + maxCount);
    }
}
