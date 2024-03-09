package String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepCharacter {
    public static void main(String[] args) {
        String str="racecars";
        System.out.println("firstNonRepeatingCharcter(str) = " + firstNonRepeatingCharcter(str));
    }
    public static char firstNonRepeatingCharcter(String str){
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            if (map.get(ch) == 1){
                return ch;
            }
            
        }
      return '\0';
    }
}
