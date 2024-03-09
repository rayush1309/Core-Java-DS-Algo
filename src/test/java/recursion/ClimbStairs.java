package recursion;

public class ClimbStairs {
    public static void main(String[] args) {
        int n=3;
        System.out.println(cs(n));

    }
    public static  int cs(int n) {
        if (n <=3) {
            return n;
        }

        return cs(n - 1) + cs(n - 2);
    }
}
