import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> employee = new LinkedList<>();
        employee.add("rahul");
        employee.add("sank");
        employee.add("sindhu");
        employee.offer("sravs");
        System.out.println(employee);
        String topLevelElement = employee.peek();
        System.out.println(topLevelElement);
        employee.remove();
        System.out.println(employee);
        employee.poll();
        System.out.println(employee);
    }
    
}
