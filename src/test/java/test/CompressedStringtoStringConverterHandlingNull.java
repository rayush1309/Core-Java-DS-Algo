package test;

hpublic class CompressedStringtoStringConverterHandlingNull {
    public static void main(String[] args) {
        String str = null;
        System.out.println(stringManipulation2(str));
    }

    public static String stringManipulation2(String str) {
        try {
            String ans = "";

            // Check for null input
            if (str != null) {
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                        int num = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
                        for (int j = 0; j < num; j++) {
                            ans = ans + ch;
                        }
                        i++; // Skip the digit
                    } else {
                        ans = ans + ch;
                    }
                }
            } else {
                System.out.println("Input string is null.");
            }

            return ans;
        } catch (Exception e) {
            e.printStackTrace();
            return ""; // Return an empty string or handle the exception as needed
        }
    }
}
