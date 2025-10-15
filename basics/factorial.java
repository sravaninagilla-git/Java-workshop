import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        if (num < 0) {
            System.out.println("Factorial number will be not negative");
        } else if (num == 0) {
            System.out.println("factorial of " + num + " is: " + factorial);
        } else {
            for (int i = num; i >= 1; i--) {
                factorial *= i;
            }
            System.out.println("factorial of " + num + " is: " + factorial);
        }

    }
}
