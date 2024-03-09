package javaBrains;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExercise {

    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();
        Iterator<String> it = fruits.iterator();

        while (it.hasNext()) {
            String fruitName = it.next();
            System.out.println("fruitName = " + fruitName);
        }
    }

}

class FruitSupplier {

    public Collection<String> getFruits() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}
