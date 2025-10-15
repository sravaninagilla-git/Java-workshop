
class Circle {

    protected double radius;

 
    public Circle(double radius) {
        this.radius = radius;
    }


    public double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;


    public Cylinder(double radius, double height) {
        super(radius); 
        this.height = height;
    }


    public double surfaceArea() {
      
        return 2 * Math.PI * radius * (height + radius);
    }

    
    public double volume() {
       
        return Math.PI * radius * radius * height;
    }
}


public class third {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Surface Area of Cylinder: " + cylinder.surfaceArea());
        System.out.println("Volume of Cylinder: " + cylinder.volume());
    }
}

    

