// create a linked list of integers. Add numbers 10,20,30.Then add 15 at the second position.Iterate and print all elements using an enhanced for loop.
import java.util.LinkedList;

public class second {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Intial numbers:"+numbers);
        numbers.add(1, 15);
        System.out.println("list after adding numbers"+numbers);
        System.out.println("Elements: " );
        for(int num:numbers){
            System.out.println(num + " ");

        }
        System.out.println();

    }
    
}
