public class tripletscount {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 10;
        int ans = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        System.out.println("The triplet count is: " + ans);
    }
}
        /*int[] arr = {1, 5, 3, 2, 4, 6};
        int x = 10;  
        int count = 0;

        for (int i = 0; i < arr.length- 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }

        System.out.println("Total Triplets with sum " + x + " = " + count);
    }
}*/

    
