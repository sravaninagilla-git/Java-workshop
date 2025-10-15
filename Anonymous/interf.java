// Functional 
interface
import First.second.second;
interface Habit{
    void sleeping();
    default void running(){
        System.out.println("Running");
    }
    static void hunting(){
        System.out.println("Hunting");
    }
}
class Tiger implements Habit{
    public void sleeping(){
        System.out.println("sleeping...");
    }
}

public class interf {
    public static void main(String[] args) {
        Habit.hunting();
        Tiger t = new Tiger();
        t.sleeping();
        t.running();
    }
    
    
}
