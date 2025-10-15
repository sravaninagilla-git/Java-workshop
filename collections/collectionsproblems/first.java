// create an ArrayList of Strings. Add "Apple","Banana",and "cherry" to it. Print the list ,then remove "banana" and print the lis again.

import java.util.ArrayList;
import java.util.List;

public class first {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
        
    }

    
}
