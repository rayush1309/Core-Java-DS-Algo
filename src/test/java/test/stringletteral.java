package test;

public class stringletteral {
    public static void main(String[] args) {
        String s1= "yellow";
        String s2=  "yellow";
        String s4= new String("yellow");
        System.out.println(s2==s4);
        System.out.println(s1==s2);
        String s3=s2;
        s2="pink";
        String s5=s2;
        System.out.println(s5);
        //System.out.println(s2);
       // System.out.println(s3);


    }
    /*
 public class Animal {

String color = “white”;
Public void method ()
{
Print (“Animal method”);
}

public class Cat extends Animal {

String color = “black”;
Public void method ()
{
Print (“Cat method”);
}

Animal obj = new Cat();
Print obj.color;
obj.method();
     */
}
