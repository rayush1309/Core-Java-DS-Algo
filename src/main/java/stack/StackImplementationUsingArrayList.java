package stack;

import java.util.ArrayList;

public class StackImplementationUsingArrayList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public static void push(int data) {
            list.add(data);
        }

        // Pop
        // Return type is int because we store the data before deleting it
        // and return it
        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }
}
