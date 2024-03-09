package javaBrains.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListBidirectionalTraversal {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        ListIterator<String> iterator=list.listIterator();
        //forWard traversal
        System.out.println("***************** Forward Traversal ******************");
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("****************** Back order Traversal ******************");
        //Back order traversal
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
