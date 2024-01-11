package arrays;

public class ArrayDemoOne {

	public static void main(String[] args) {
		//loops
			//natural numbers 1 to 10, 20, n
		//Diff Integer data
			//24,56,89,12,57
		
			//  a[0],a[1],a[2],a[3]
		int a[]= {24,56,89,12};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);//a[3],a[2],a[1],a[0]
		}
		
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		System.out.println("Sum : "+s);
	}

}
