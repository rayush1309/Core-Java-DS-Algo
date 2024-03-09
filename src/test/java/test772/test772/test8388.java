import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test8388 {
    public static void main(String[] args) {
        List<Number> ll = new ArrayList<>();
        Object[][] nestedArray = {
                {1},
                {"abc"},
                {12, "def", "123"},
                {"ghi", "789", 10,12.8},
                {"xyz"}
        };

        for (Object[] row : nestedArray) {
            for (Object element : row) {
                if (element instanceof Number) {
                    ll.add((Number) element);
                }
            }
        }

     Collections.sort(ll, Comparator.comparingDouble(Number::doubleValue));


        System.out.println(ll);
    }
}
