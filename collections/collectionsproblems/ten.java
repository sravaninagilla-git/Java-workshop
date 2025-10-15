import java.util.PriorityQueue;

public class ten {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println(numbers);
        while(!numbers.isEmpty()){
            System.out.println("Priority is:" + numbers.poll());
        }

    }
    
}
