package test772.test772;

public class RemoveString {

    public static void main(String[] args) {
        String[] arr = {"yyu", "888", "0"};
        isNumeric(arr);
    }

    public static void isNumeric(String[] str) {
        for (String st : str) {
            if (isAllDigits(st))
                System.out.println(st);
        }
    }

    public static boolean isAllDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
