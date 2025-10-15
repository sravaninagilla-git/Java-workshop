// Simulate a basic queue using a LinkedList. Add "TASK A ","TASK B","TASK C".Then, remove and print tasks one by one until queue is empty.
import java.util.LinkedList;
import java.util.Queue;

public class nine {
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("TASK A");
        taskQueue.add("TASK B");
        taskQueue.add("TASK C");
        System.out.println(taskQueue);
        while(!taskQueue.isEmpty()){
            System.out.println("My Task:"+taskQueue.poll());
        }


    }    
}
