import java.util.Arrays;
import java.util.Scanner;

public class rotatetimes {
    public static int[] rotatektimes(int numbers[], int k, int n){
        k = k % n;
        int ans[] = new int[n];
        int j = 0;
        for(int i = n - k; i < n; i++){
            ans[j++] = numbers [i];
            // i =2,j=0,ans[0] = 3
            // i = 3, j=1,ans[1] = 4
            //i = 4, j=2,ans[2] = 5
        }
        for(int i = 0; i<n-k;i++){
            ans[j++] = numbers [i];

        }
        return ans;

    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++){
        numbers[i] = sc.nextInt();
    }
    System.out.println("Enter k :");
    int k = sc.nextInt();
    System.out.println(Arrays.toString(rotatektimes(numbers,k,n)));



}
    
}
