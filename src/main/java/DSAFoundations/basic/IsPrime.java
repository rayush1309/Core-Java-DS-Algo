package DSAFoundations;

public class IsPrime {
    public static void main(String[] args) {
        int n=23;
        System.out.println("isPrime() = " + isPrime(n));

    }
    public static  boolean isPrime(int n){
        int fact=0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0){
                fact++;
            }

        }
        if (fact==2){
            return true;
        }else {
            return false;
        }
    }
}
