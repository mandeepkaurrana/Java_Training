package arrays;

public class PracticeArray {

	 // Main method
    public static void main(String[] args) {
 
        // Declare and Initialize an integer array
        int arr[] = { 2, 4, 3, 8, 11, 50, 7, 15, 5 };
 
         int evenSum = 0;
 
        System.out.println("The sum of all Even numbers:");
 
        for (int i = 0; i < arr.length; i++) {
 
            
            if (arr[i] % 2 == 0) {
 
                if (evenSum > 0) {
                    System.out.print(" + " + arr[i]);
                } else {
                    System.out.print(arr[i]);
                }
 
                // Calculate the even sum
                evenSum = evenSum + arr[i];
            }
        }
 
        // Print the final result
        System.out.println(" = " + evenSum);
 
    }
 
}