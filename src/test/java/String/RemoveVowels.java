package String;

import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        String str="ice cream";
        System.out.println("removeVowels(str) = " + removeVowels(str));

    }
    public static String removeVowels(String str){
        Set<Character> vowels= Set.of('a','e','i','o','u');
        char [] chars= str.toCharArray();
        StringBuilder sb= new StringBuilder();
        for (Character ch:chars){
            if (!vowels.contains(ch)){
                sb.append(ch);
            }

        }
        return sb.toString();
    }
}
