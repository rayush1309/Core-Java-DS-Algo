package javaBrains;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String str="())";
        System.out.println(isvalid(str));

    }
    public static boolean isvalid(String str){
        Stack<Character> st= new Stack<>();
        for (char c: str.toCharArray()){
            if (c=='('){
                st.push(c);
            } else if (c==')' && !st.isEmpty()) {
                st.pop();
            }else {
                return false;
            }
        }
        return st.isEmpty();

    }
}
