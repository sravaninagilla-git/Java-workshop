import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
public class eleven {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","mango","banana","apple","mango","apple");
        HashMap<String , Integer> frequencyOfFruit = new HashMap<>();
        for(String fruit:fruits){
            if(frequencyOfFruit.containsKey(fruit)){
                frequencyOfFruit.put(fruit, frequencyOfFruit.get(fruit)+1);
            }else{
                frequencyOfFruit.put(fruit, 1);
            }
        }
        System.out.println(frequencyOfFruit);
    }   
}
