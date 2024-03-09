package javaBrains;

import java.util.HashMap;
import java.util.Map;

public class ReturnMaxFreqString {
    public static void main(String[] args) {
        String str = "The quick brown brown brown brown fox jumps over the lazdog The quick brown fox is quick quick";
        System.out.println(returnMaxcountfreq(str));
    }

    public static String returnMaxcountfreq(String str) {
        String[] s = str.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            String st = s[i];
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
        String sp = "";
        int t = 1;
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() > t) {
                t = m.getValue();
                sp = m.getKey();
            }
        }
        return sp;
    }
}
