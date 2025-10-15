import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        /*
         * ArrayList<String> shoppingCart = new ArrayList<>();
         * System.out.println("shoppingCart:"+shoppingCart);
         * shoppingCart.add("frock");
         * shoppingCart.add("lehenga");
         * shoppingCart.add("chudidhar");
         * shoppingCart.add("kuthiset");
         * System.out.println("shoppingCart:"+shoppingCart);
         * //getting at the index given
         * shoppingCart.get(2);
         * System.out.println("shoppingCart:"+shoppingCart);
         * System.out.println(shoppingCart.contains("frock"));
         * //adding the value to given list
         * shoppingCart.set(2, "saree");
         * System.out.println("shoppingCart:"+shoppingCart);
         * //remove the element
         * shoppingCart.remove(0);
         * System.out.println("shoppingCart:"+shoppingCart);
         * //contains
         * System.out.println(shoppingCart.contains("dupatta"));
         * //is Empty
         * System.out.println(shoppingCart.isEmpty());
         * ArrayList<Integer> numbers = new ArrayList<>();
         * numbers.add(9);
         * numbers.add(8);
         * numbers.add(0);
         * Collections.sort(numbers);
         * System.out.println("Sorted to numbers:"+numbers);
         */
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("gova");
        Collections.sort(fruits);
        System.out.println(fruits);
        int indexOfBanana = Collections.binarySearch(fruits, "Banana");
        System.out.println(indexOfBanana);
        Iterator<String> fruitItrator = fruits.iterator();
        while (fruitItrator.hasNext()) {
            String fruit = fruitItrator.next();
            System.out.println("fruit:" + fruit);
            if (fruit.equals("banana")) {
                fruitItrator.remove();

            }
        }
        System.out.println("fruits after iteration" + fruits);

    }
}
