//Given two ArrayLists of integers,fnd and return a new ArrayList containing only the elements that are common to both lists(without duplicates). 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class fourteen {
    public static List<Integer> findCommonElements(List<Integer> list1,List<Integer> list2){
        Set<Integer> set1 = new HashSet<>(list1);
        List<Integer> common = new ArrayList<>();
        for(int num : list2){
            if(set1.contains(num)){
                common.add(num);
                set1.remove(num);
            }
        }
        return common;-
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7,8);
        System.out.println(findCommonElements(list1, list2));

        
    }
    
}
