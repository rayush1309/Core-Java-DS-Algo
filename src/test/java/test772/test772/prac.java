package test772.test772;

import java.util.ArrayList;
import java.util.List;

public class prac {
    public static void main(String[] args) {
        List<Object> ll = new ArrayList<>();
        Object[][] nestedArray = {
                {1},
                {"abc"},
                {2, "deftest", "123"},
                {"gtesthi", "7test89", 3, 10},
                {"xyz"}
        };

        for (Object[] row : nestedArray) {
            for (Object element : row) {
                if (element instanceof Object) {
                   String s=element.toString();
                   if (s.contains("test")){
                       System.out.println(s);
                }
            }
        }
        //System.out.println(ll);
    }
    }
}
