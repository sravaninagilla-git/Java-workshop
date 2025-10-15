public class firstrepeatingproblem {
    public static void main(String[] args) {
        int arr[] = { 1,5,3,4,7,5,4};
        int ans = -1;
        boolean found = false;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1 ; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    found = true;
                    System.out.println(arr[i]);
                    break;
                }
            }
            if(found){
                break;
            }
        }
    }
    
}
