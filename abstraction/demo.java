class Animal {
    /*
     * Animal() {
     * System.out.println("default");
     * }
     * Animal(String name){
     * System.out.println("parameterized constructor");
     * }
     * Animal(int i){
     * 
     * }
     * }
     * 
     * public class demo {
     * public static void main(String[] args) {
     * Animal a = new Animal();
     * }
     */

    /*
     * int add(int a, int b) {`
     * System.out.println(a + " + " + b);
     * return a + b;
     * }
     * 
     * int add(int i, int j, int k) {
     * return i + j + k;
     * }
     * }
     */
    void add() {
        System.out.println("Animal add");
    }
}
class Dog extends Animal {
    void add() {
        System.out.println("Dog add");
    }
}
public class demo {
    public static void main(String[] args) {
        // Animal a = new Animal();
        Dog d = new Dog();
        d.add();
    }
}