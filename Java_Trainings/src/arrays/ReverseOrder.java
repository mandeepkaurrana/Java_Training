package arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,49};
		System.out.println("The reverse order of the Numbers which are not divisible by 7 are as follows:");
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%7!=0)
			{
				System.out.println(arr[i]);
			}
			else {
				System.out.println("No.is divisible: " +arr[i]);
			}
		}
	}
}
