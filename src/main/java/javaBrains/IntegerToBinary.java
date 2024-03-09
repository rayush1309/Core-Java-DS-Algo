package javaBrains;

public class IntegerToBinary {
    public static void main(String[] args) {
        int n=91;
        int ans=0;
        int mul=1;
        while (n>0){
            int rem=n%2;
            ans= ans+ rem*mul;
            mul=mul*10;
            n/=2;
        }
        System.out.println(ans);
    }
}
