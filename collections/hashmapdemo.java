import java.util.HashMap;
import java.util.Map;

public class hashmapdemo {
    public static void main(String[] args) {
        HashMap <String , String> programmingTerms = new HashMap<>();
        // add element
        programmingTerms.put("java", "A high-level,class-based,object-oriented programming language");
        programmingTerms.put("python", "An interpreted,high-level,general purpose programming language.");
        programmingTerms.put("SQL", "A standard language for storing manipulating and retrieving data from data base");
        System.out.println(programmingTerms);
        programmingTerms.put("java","only a programming language");
        System.out.println(programmingTerms);
        //get
        System.out.println(programmingTerms.get("python"));
        //contains key
        System.out.println(programmingTerms.containsKey("c++"));
        //contain value
        System.out.println(programmingTerms.containsValue("A Standard language for storing manipulating and retrieving data from data base"));
        programmingTerms.remove("python");
        System.out.println(programmingTerms);
        System.out.println(programmingTerms.size());
        //iteration
        //iterate over keys
        for(String key:programmingTerms.keySet()){
            System.out.println(key);
        }
        //values
        for(String value: programmingTerms.values()){
            System.out.println(value);
        }
        for(Map.Entry<String,String>entry:programmingTerms.entrySet()){
                System.out.println("Temrs:"+ entry.getKey() + "-> definition:" + entry.getValue());
            }

        }

    }
    

