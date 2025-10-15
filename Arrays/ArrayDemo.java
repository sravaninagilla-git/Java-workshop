import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // int numbers[] = { 100, 2, 3, 4, 50 };
        // String names[] = { "sindhu", "sravani", "sankeerthana" };
        // int marks[] = new int[4];
        // marks[3] = 20;
        // marks[2] = 50;
        // marks[1] = 60;
        // marks[0] = 70;
        // for (int i = 0; i < marks.length; i++)
        // System.out.println(marks[i]);
        // for (int num : numbers) {
        // System.out.println(num * 2);
        // }
        // we want to add the arrays
        // int sum=0;
        // for (int n: numbers){
        // sum += n;

        // }
        // System.out.println(" sum of the array is:"+ sum);
        // finding max value
        // finding min value
        // int min=Integer.MAX_VALUE;
        // for(int num:numbers){
        // if (num< min){
        // min = num;
        // }
        // }
        // System.out.println(" Minimum value in the array is:"+min);
        // printing the index of array
        // String target = "sravani";
        // for (int i = 0; i < names.length; i++) {
        // if (names[i] == target) {
        // System.out.println(i);
        // }
        // }
        // printing elements of the array
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int number[] = new int[size];
         //taking element from user
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < size; i++) {
           number[i] = sc.nextInt();
        }
        // printing the elements
        //for (int i = 0; i < size; i++) {
          //  System.out.println(number[i] + " ");
        //}*/
        // finding the second max value
        /*int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i< size; i++){
            if(number[i] >= firstMax){
              secondMax = firstMax;
              firstMax = number[i];
            }
            if(number [i] > secondMax && number[i]< firstMax){
              secondMax = number[i];
            }
        }
        System.out.println("The first max value is:"+ firstMax);
        System.out.println("The second max value is:"+ secondMax); */
        int arr[]={ 1,2,3,4,5 };
        int firstMax = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;
      for(int num : arr){
        if(num> firstMax){
          secondMax=firstMax;
          firstMax=num;
        }
        else if(num> secondMax && num < firstMax){
          secondMax = num;
        }
      }  
        System.out.println("second max value:"+secondMax);
    }

}
