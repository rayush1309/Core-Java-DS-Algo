package String;

public class PrintNameinShortForm {
    public static void main(String[] args) {
        String name="Anand Kumar Hooda";
        System.out.println(shortName(name));

    }
    public static String shortName(String name){
        String ans="";
        String [] str= name.split(" ");
        for (int i=0;i<str.length-1;i++){
            String s=str[i];
            ans=ans+s.charAt(0)+".";
        }
        ans=ans+str[str.length-1];
        return ans;
    }
}
