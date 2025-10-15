import java.util.Queue;
import java.util.LinkedList;

public class queuedemo {
    public static void main(String[] args) {
        Queue<String>customerQueue = new LinkedList<>();
        customerQueue.add("Alice");
        customerQueue.add("srav");
        customerQueue.add("pav");
        System.out.println(customerQueue);
        //peek
        System.out.println(customerQueue.peek());
        //remove or pull
        customerQueue.poll();
        customerQueue.remove();
        System.out.println(customerQueue);
        System.out.println(customerQueue.isEmpty());
    }
    
}
