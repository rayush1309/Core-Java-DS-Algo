package test772.test772;

import java.util.Stack;

public class test77five {
    public static void main(String[] args) {
        String str="ghfgh(fga[(ag])agng";
        System.out.println(isValid(str));
    }
    public static  boolean isValid(String str){
        Stack<Character> st= new Stack<>();
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (!Character.isAlphabetic(ch)) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    st.push(ch);

                } else if (ch == ')' && st.peek() == '(') {
                    st.pop();

                } else if (ch == '}' && st.peek() == '{') {
                    st.pop();

                } else if (ch == ']' && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

}
