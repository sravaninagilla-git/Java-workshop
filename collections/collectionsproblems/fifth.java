// create an ArrayList of strings "orange","Apple","Grape".sort this list alphabetically using collections sorted and print sorted list.
import java.util.ArrayList;
import java.util.Collections;

public class fifth {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Apple");
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println("sorted list:" + fruits);

    }
    
}
