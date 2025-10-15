// with static and without final
/*class Animal{
    static void sound(){
        System.out.println("Animal makes a sound...!!!");
    }
} 
class Dog extends Animal{
    static void sound(){
        System.out.println("Dog barks...!!!");
    }
}
public class second {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
    
}*/
//without static with final
class Animal {
    final void sound() {
        System.out.println("Animal makes a sound...!!!");
    }
}
class Dog extends Animal {
     
}
public class second {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
