class Box{
    private int  height;
    private int width;
    private int breadth;
public Box(int height,int width,int breadth){

    this.height=height;
    this.width=width;
    this.breadth=breadth;
}
public int volume(){
    return height * width * breadth;
}
}
public class question {
    public static void main(String[] args) {
        Box b = new Box(10,20,30);
        System.out.println("volume of the box is:" + b.volume());
   }    
}
