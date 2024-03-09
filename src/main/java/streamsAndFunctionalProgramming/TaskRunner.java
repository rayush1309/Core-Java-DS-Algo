package streamsAndFunctionalProgramming;

import java.time.LocalDateTime;

public class TaskRunner {
    public static void runner(){
        System.out.println("start = " + LocalDateTime.now());
        System.out.println("Hello World !!");
        System.out.println("End = " +LocalDateTime.now());
    }
    public static void main(String[] args) {
     TaskRunner.runner();

    }
}
