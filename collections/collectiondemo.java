import java.util.ArrayList;
import java.util.Iterator;

public class collectiondemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(60);
        number.add(25);
        number.add(20);
        number.add(10);
        Iterator<Integer> itr = number.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(int num:number){
            System.out.println(num);
        }
    }
    
}
