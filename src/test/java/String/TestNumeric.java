package String;

public class TestNumeric {
    public static void main(String[] args) {
        String str="3398.0";
        System.out.println(isNumeric(str));
        System.out.println(isNumeric2(str));
    }
    //first- way
    public static boolean isNumeric(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (!Character.isDigit(ch)){
                return false;
            }

        }
        return  true;
    }
    //2nd Way:
    public static boolean isNumeric2(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is within the ASCII range of numeric characters
            if (ch!='.' && (ch < '0' || ch > '9' )) {
                return false;
            }
        }
        return true;
    }
}
