import java.util.ArrayList;
import java.util.Collections;

public class eighth {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        int indexOfElement1=Collections.binarySearch(numbers, 30);
        System.out.println("Index of 30:" + indexOfElement1);
        int indexOfElement2=Collections.binarySearch(numbers,25);
        System.out.println("Index of 25:"+indexOfElement2);
    }
    
}
