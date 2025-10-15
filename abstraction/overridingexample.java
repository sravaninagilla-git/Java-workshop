class Animal{
    static void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    static void sound(){
        System.out.println("dog sound");
    }
}
class Cat extends Animal{
    static void sound(){
        System.out.println("meow");
    }
}
public class overridingexample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        a.sound();
        d.sound();
        c.sound();
    }    
}
