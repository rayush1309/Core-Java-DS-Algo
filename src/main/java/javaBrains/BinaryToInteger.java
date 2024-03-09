package javaBrains;

public class BinaryToInteger {
    public static void main(String[] args) {
        int n=10;
        int ans=0;
        int mul=1;
        while (n>0){
            int rem=n%10;
            ans= ans+rem*mul;
            mul=mul*2;
            n/=10;
        }
        System.out.println(ans);
    }
}
