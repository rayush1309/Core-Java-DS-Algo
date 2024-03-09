package javaBrains.Collections;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        List<String>fruits= new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("mango");
        fruits.add("kiwi");
        System.out.println(fruits);
        System.out.println("****************************");
        List<String> subList=fruits.subList(1,4);
        System.out.println(subList);
        System.out.println("#*******************************#");
        fruits.set(1,"Lichi");
        System.out.println(subList);
        System.out.println("********************************************");
        System.out.println(fruits);
        /*
        System.out.println("*************** Clear **********************");
        fruits.subList(1,3).clear();
        System.out.println(subList);
*/

    }
}
