import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> customers = new LinkedList<>();
        customers.add("sravani");
        customers.add("sank");
        customers.add("sindhu");
        customers.add("kaveri");
        System.out.println("customers:" + customers);

        customers.add(2,"harsh");
        System.out.println("customers:"+customers);

        String firstCustomer = customers.getFirst();
        System.out.println("first customer:" + firstCustomer);
        System.out.println(customers.get(3));
        System.out.println(customers.set(1, "pav"));
        System.out.println("customers:"+customers);
        System.out.println("Last customer:"+customers.getLast());
        //remove the first and last elements
        System.out.println(customers.removeLast());
        System.out.println(customers.removeFirst());
        System.out.println("customers:"+customers);
        
    }
    
}
