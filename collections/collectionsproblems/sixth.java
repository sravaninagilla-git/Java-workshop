//Give an HashMap <String , Integer>

import java.util.HashMap;
import java.util.Map;

public class sixth {
    public static void main(String[] args) {
        HashMap<String , Integer> grocery = new HashMap<>();
        grocery.put("bread", 50);
        grocery.put("egg", 10);
        grocery.put("salt",13);
        

        for(Map.Entry<String , Integer> entry: grocery.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
    
}
