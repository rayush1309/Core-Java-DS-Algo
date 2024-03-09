package streamsAndFunctionalProgramming;

import java.time.LocalDateTime;

public class TaskRunner2 {
    public static void runner(Task task){
        System.out.println("start = " + LocalDateTime.now());
        task.run();
        System.out.println("End = " +LocalDateTime.now());
    }

    public static void main(String[] args) {
        Task task = new HelloWorldTask();
        TaskRunner2.runner(task);
    }
}

interface Task {
    void run();
}

class HelloWorldTask implements Task {
    @Override
    public void run(){
        System.out.println("Hello World !");
    }
}
