
class Car{
    String carName = "Creta";
    public void driveFast(){
        System.out.println("Driving Fast!!");
    }
}   
    public class demo {
    public static void main(String[] args) {
        new Car().driveFast();
        System.out.println(new Car().carName);   
    }  
}
