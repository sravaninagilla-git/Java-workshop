//Create a class rectangle and use inheritance to create another class cuboid, try to keep it as
// close to the real-world scenario as possible create methods for area & volume also create getters and setters
class Rectangle{
    private double length;
    private double width;
    public Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double area(){
        return length * width;
    }
}
class Cuboid extends Rectangle{
    private double height;
    public Cuboid (double length , double width , double height){
        super(length,width);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double surfaceArea(){
        double l = getLength();
        double w = getWidth();
        return 2 * (l*w + l*height + w*height);

    }
    public double volume(){
        return getLength() * getWidth() * height;
    }

}
public class democlass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5 ,3);
        System.out.println("Area of Rectangle:" + rectangle.area());
        Cuboid cuboid = new Cuboid(3,4,5);
        System.out.println("Surface area of cuboid:" + cuboid.surfaceArea());
        System.out.println("Volume of cuboid:" + cuboid.volume());
        cuboid.setHeight(10);
        System.out.println("updated volume of cuboid:" + cuboid.volume());
    }
    
}
