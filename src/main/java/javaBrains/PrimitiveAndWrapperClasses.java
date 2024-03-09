package javaBrains;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        //Step 1: declare primitive Varriable
        int age=20;
        //Step 2: Convert Primitive Varriable to Wrapper Object
        Integer ageObj= age; // Autoboxing
        //Step 3: print the value of Wrapper Object
        System.out.println("ageObj = " + ageObj);
        //Step 4:  Convert wrapper object back to primitive Varriable
        age=ageObj ;//Unboxing
        //Step 5: print the value of primitive Varriable
        System.out.println("age = " + age);




    }
}
