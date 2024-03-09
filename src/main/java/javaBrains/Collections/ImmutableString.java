package javaBrains.Collections;

public class ImmutableString {
    private final String name;
    private final int age;

    public ImmutableString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String setName() {
        return name;
    }

    public int setAge() {
        return age;
    }


    public static void main(String[] args) {
        // Creating an instance of ImmutableString with required parameters
        ImmutableString immutableString = new ImmutableString("John", 25);
        System.out.println("Name: " + immutableString.getName());
        System.out.println("Age: " + immutableString.getAge());

        // Attempting to use misleading setter methods (won't actually modify the object)
       // immutableString.setName("Ayush");
      //  immutableString.setAge(23);

        // Accessing the immutable properties
        System.out.println("Name: " + immutableString.getName());
        System.out.println("Age: " + immutableString.getAge());
    }
}
