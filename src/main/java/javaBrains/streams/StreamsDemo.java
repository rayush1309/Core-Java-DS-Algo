package javaBrains.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> names=List.of("Foo","Bar", "Baz");
        Stream<String> stream =names.stream();
        stream.forEach(System.out::println);
        /*
        / Using lambda expression
        names.forEach(name -> System.out.println(name));

        // Using method reference
        names.forEach(System.out::println);
         */
        Set<String> names1=Set.of("Foo","Bar", "Baz");
        Stream<String> stream1 =names1.stream();
        stream1.forEach(System.out::println);
        int [] nums={1,2,3,4,5};
        Arrays.stream(nums).forEach(System.out::println);

        // using stream.of
       Stream<String> s= Stream.of("manago","Banana","Grapes");
       s.forEach(System.out::println);




    }
}
