import java.util.Scanner;
public class reversearrays {
    public static void rotateInPlace(int number[], int k, int n){
        k = k % n;
        reversearrays(number , 0,n - k - 1);
        reversearrays(number , n - k, n - 1);
        reversearrays(number , 0,n - 1);
          for(int num: number){
            System.out.println(num +" ");
          }
    }
    public static int[] rotatektimes(int numbers[], int k, int n) {
        k = k % n;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = numbers[i];

        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = numbers[i];

        }
        return ans;
    }
    public static void swap(int arr[], int start, int end) {
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
    }
    public static void reversearrays(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter k :");
        int k = sc.nextInt();
        //System.out.println(Arrays.toString(rotatektimes(numbers, k, n)));
        rotateInPlace(numbers,k,n);
    }
}


