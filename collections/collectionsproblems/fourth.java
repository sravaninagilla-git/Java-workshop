import java.util.HashMap;

public class fourth {
    public static void main(String[] args) {
        HashMap< Integer , String> student = new HashMap<>();
        student.put(101,"Alice" );
        student.put(102, "Bob");
        student.put(103, "Charlie");
        System.out.println(student);
        
        System.out.println("Name of the student 102 :"+ student.get(102));
        
        System.out.println("Does student 104 exists :"+ student.containsKey(104));        
    }
    
}
