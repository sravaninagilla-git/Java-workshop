public class arrayswapping {
    public static void swap(int a, int b) {
        // given 2 integers a and b swap the 2 given values using temporary variables
        /*System.out.println("Before swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int temp =0;
        temp = a;// 7
        a = b;// 3
        b = temp;
        System.out.println("after swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        swap(a, b);*/
        // given 2 integers a and b swap the 2 given values using sum and difference method
        System.out.println("Before swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        swap(a, b);

    }

}
