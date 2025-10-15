import java.util.Scanner;

public class lastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the element of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int occurredAt = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                occurredAt = i;
            }
        }
        System.out.println("The last occurrence the element is at index: " + occurredAt);
    }
}
