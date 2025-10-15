import java.util.Scanner;

public class conditionalstmnt {
    public static void main(String[] args) {
        System.out.println("enter the age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are child");
        }
    }
}
