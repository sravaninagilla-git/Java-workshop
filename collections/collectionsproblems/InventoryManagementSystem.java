class Product implements Comparable<Product>{
    int price;
    String name;
    int id;
    int quantity;

public Product(int price,int id,int quantity,String name){
    this.name=name;
    this.price=price;
    this.quantity=quantity;
    this.id=id;
}

public String toString(){
    return "ID:"+ id +",Name:"+name+",Price:"+price+",Quantity:"+ quantity;
}
public int compareTo(Product other){
    
    return Integer.compare(this.id,other.id);
}
}
public class InventoryManagementSystem {
    


    
}
