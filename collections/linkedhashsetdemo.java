import java.util.LinkedHashSet;

public class linkedhashsetdemo {
    public static void main(String[] args) {
        //differ in hashset and linkedhashset isthe order of the elemts printing
        LinkedHashSet<String> uniqueAttendees = new LinkedHashSet<>();
        uniqueAttendees.add("sravs");
        uniqueAttendees.add("sank");
        uniqueAttendees.add("sindhu");
        uniqueAttendees.add("sravs");
        System.out.println("uniqueAttendees:"+uniqueAttendees);
        uniqueAttendees.remove("sindhu");
        System.out.println(uniqueAttendees);
        System.out.println(uniqueAttendees.size());


    }
}