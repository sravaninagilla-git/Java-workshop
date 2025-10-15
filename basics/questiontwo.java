/*class Box {
    int height;
    int width;
    int depth;

    Box() {
        height = 0;
        width = 0;
        depth = 0;
    }

    Box(int h, int w) {
        height = h;
        width = w;
        depth = 0;
    }

    Box(Box b) {
        height = b.height;
        width = b.width;
        depth = b.depth;

    }

    int vol() {
        return height * width * depth;
    }
}*/
class shape{
    int length;
    int breadth;

}
shape(int length, int breadth){
    this.length;
    this.breadth;
}
class Rectangle extends shape {
    Rectangle(int length,int breadth){
      super(length,breadth);
    }
    int area(){
        return length * breadth;
    }
    int perimeter(){
        return 2 * (length + breadth);
    }
}
class Square extends shape{
    Square(int length, int breadth){
        super(length,breadth);
    }
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 5 
    }

}

