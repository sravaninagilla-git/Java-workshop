import java.util.TreeSet;
public class treesetdemo {
    public static void main(String[] args) {
        TreeSet<Integer> highScores = new TreeSet<>();
        highScores.add(100);
        highScores.add(10);
        highScores.add(50);
        highScores.add(900);
        highScores.add(1);
        System.out.println(highScores);
        System.out.println(highScores.first());
        System.out.println(highScores.last());
        //method to see less than from any specific element 
        System.out.println(highScores.headSet(50));
        //method to see greater than from any specific element 
        System.out.println(highScores.tailSet(50));
    }   
}
