package lld.basic;

public class ClassesAndObjects {
    // Class: it is a blueprint
    // Object: real instance of the blueprint.
    public static void main(String[] args) {
        Pair p1 = new Pair();
        p1.x = 10;
        p1.y = 100;
        p1.name = "ayush";

        Pair p2 = new Pair();
        p2.x = 100;
        p2.y = 1000;
        p2.name = "ambar";

        System.out.println(p1.x+" " + p2.x +" "+ p1.name +" "+ p2.name);
    }

    public static class Pair {
        int x;
        int y;
        String name;
    }
}