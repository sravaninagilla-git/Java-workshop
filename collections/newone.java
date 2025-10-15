import java.util.Queue;
import java.util.LinkedList;
public class newone {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        System.out.println("Intial Queue:"+queue);
        queue.remove();
        System.out.println("after removing one element:" + queue);
        queue.add("E");
        System.out.println("after adding one element:" + queue);
    }
    
}

