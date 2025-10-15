 import java.util.ArrayList;
 import java.util.HashSet;
 import java.util.List;
 import java.util.Set;
 public class thirteen {
    public static boolean containDuplicates(List<Integer>numbers){
        Set<Integer>uniqueNumber = new HashSet<>();
        for(int num:numbers){
            if(!uniqueNumber.add(num)){
                return true;
            }
        }
        return false;
    } 
      public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(containDuplicates(numbers));
        

      }
    
}
