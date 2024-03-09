package string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorPractic {
    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();
       for (String fruit:fruits){
           System.out.println("fruit = " + fruit);
       }
    }
}

class FruitSupplier {

    public Collection<String> getFruits() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("Mango");
        return list;
    }
}
