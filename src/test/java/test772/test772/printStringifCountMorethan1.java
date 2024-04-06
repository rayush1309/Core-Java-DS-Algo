package test772.test772;

import java.util.HashMap;
import java.util.Map;

public class printStringifCountMorethan1 {
    public static void main(String[] args) {
        String str = "this is my first interview and first interview for today.";
        Map<String, Integer> map = new HashMap<>();
        String[] st = str.split(" ");
        for (int i = 0; i < st.length; i++) {
            String s = st[i];
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                String s1 = entry.getKey();
                System.out.println(reverse(s1));
            }
        }
    }

    public static String reverse(String s1) {
        String rev = "";
        for (int j = 0; j < s1.length(); j++) {
            rev = s1.charAt(j) + rev;
        }
        return rev;
    }


}
