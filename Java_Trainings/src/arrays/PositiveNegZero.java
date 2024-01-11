package arrays;

public class PositiveNegZero {

	public static void main(String[] args) {
		int arr[]= {-1,-2,0,0,0,2,3,4,5,8};
		int positive=0, negative=0, zero=0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]<0) 
			{
				positive++;
			}else if(arr[i]>0) 
			{
				negative++;
			}else {
				zero++;
			}
		}
		System.out.println("Total Positive integer in the Array list: " +positive);
		System.out.println("Total Negative integer in the Array list: " +negative);
		System.out.println("Total Zeros in the Array list: " +zero);
		
	}
	
}
