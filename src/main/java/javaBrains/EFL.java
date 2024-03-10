package javaBrains;

public class EFL {
    public static void main(String[] args) {
        String [] str={"Mango","Mausami","Organge","Potato","oreo","Banana"};
        int count=0;
        for (String veg:str){
            if (veg.endsWith("o")){
                count++;
            }
        }
        System.out.println(count);
    }
}
