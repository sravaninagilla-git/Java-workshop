class Car{
    String carName = "Creta";
    public void driveFast(){
        System.out.println("Driving Fast!!");
    }
}   
class Animal{
    public void sound(){

    }
}
class Dog extends Animal{
    // Inheritance as well as is-a relationship
    // Dog Is-a relationship
    public void bark(){
        System.out.println("Dog Barks");
    }
}
public class IS {
    public static void main(String[] args) {
        new Car().driveFast();
        System.out.println(new Car().carName);
        
    }

    
}
