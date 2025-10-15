import java.util.LinkedHashMap;
public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String , String> configurations = new LinkedHashMap<>();
        configurations.put("theme" , "dark");
        configurations.put("language" , "en_US");
        configurations.put("notifications" , "enabled");
        configurations.put("theme","light");
        System.out.println(configurations);
        //get
        System.out.println(configurations.get("theme"));
        //remove
        System.out.println(configurations.remove("notifications"));
        
    }
    
}
