package test772.test772;

public class ValidIPAddress {
    public static void main(String[] args) {
        String str = "10.0.25.255";
        System.out.println(validIP(str));
    }

    private static boolean validIP(String str) {
        String[] st = str.split("\\.");

        // Check if the IP address has exactly 4 parts separated by dots
        if (st.length != 4) {
            return false;
        }

        for (int i = 0; i < st.length; i++) {
            String s = st[i];

            // Check if each part is a valid integer
            try {
                int a = Integer.parseInt(s);

                // Check if the integer is within the valid range
                if (!(a >= 0 && a <= 255)) {
                    return false;
                }
            } catch (NumberFormatException e) {
                // If parsing to integer fails, it's not a valid IP
                return false;
            }
        }
        return true;
    }
}
