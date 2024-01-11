package oops;

public class Factorial {

	public void doFactorial(int n)//here n is parameter
	{
		int s=1;
		for(int i=n;i>=1;i--)
		{
			s=s*i;
			
		}
		System.out.println("Factorial : "+s);
	}
	
	
}
