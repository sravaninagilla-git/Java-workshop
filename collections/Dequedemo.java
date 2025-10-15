import java.util.ArrayDeque;
//import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class Dequedemo {
    public static void main(String[] args) {
        /*Deque<String> groceryList = new ArrayDeque<>();
        groceryList.addFirst("soap");
        groceryList.addFirst("bread");
        groceryList.addFirst("milk");
        groceryList.addFirst("chicken");
        System.out.println(groceryList);

        groceryList.removeFirst();
        groceryList.removeLast();
        System.out.println(groceryList);
        System.out.println(groceryList.peekFirst());
        System.out.println(groceryList.peekLast());*/
        /*Deque<String> browseHistory = new ArrayDeque<>();
        browseHistory.push("google.com");
        browseHistory.push("youtube.com");
        browseHistory.push("stackoverflow.com");
        browseHistory.pop();
        System.out.println(browseHistory);*/
        /*Deque<Integer> numbers = new ArrayDeque<>();
        numbers.addFirst(45);
        numbers.add(4);
        numbers.addLast(23);
        System.out.println(numbers);
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);*/
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.add(23);
        numbers.add(65);
        System.out.println(numbers);

        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        }
    }
    

