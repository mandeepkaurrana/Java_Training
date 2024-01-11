package arrays;
// WAP to Array of 10 integers, Calculate the sum of even elements
public class PracticeSumOfEven {

	public static void main(String[] args) 
	{
		
		int arr[] = { 1,2,3,4,5,6,7,8,9,10};
		int evenSum = 0;
		  
		System.out.println("The sum of all Even numbers: ");
		
		for (int i = 0; i <= arr.length; i++){  // Iterate the array
		
			if(arr[i] % 2 == 0){// Check whether the No. is an Even if reminder is 0, it is an Even number
			
				if (evenSum > 0) 
				{
                   System.out.print(" + " +arr[i]);
                } 
				else 
			   {
                   System.out.print(arr[i]);
               }
 
                evenSum = evenSum + arr[i]; // Calculate the even sum
            }
        }
 
        System.out.println(" = " + evenSum);  // Print the final result
	}
}
	