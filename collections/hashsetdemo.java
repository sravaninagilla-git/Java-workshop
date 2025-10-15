import java.util.HashSet;

public class hashsetdemo {
    public static void main(String[] args) {
        HashSet<String> uniqueAttendees = new HashSet<>();
        uniqueAttendees.add("sravs");
        uniqueAttendees.add("sank");
        uniqueAttendees.add("sindhu");
        uniqueAttendees.add("sravs");
        System.out.println(uniqueAttendees);
        //size of the set
        System.out.println(uniqueAttendees.size());
        //contains represent to check element is present in the set
        System.out.println(uniqueAttendees.contains("sravs"));
        //for removing the element
        uniqueAttendees.remove("sank");
        System.out.println(uniqueAttendees);
        //for iterating over the set
        for(String name: uniqueAttendees){
            System.out.println(name);
        }
        //clear method to clear the set
        uniqueAttendees.clear();
        System.out.println(uniqueAttendees);
    }
    
}
