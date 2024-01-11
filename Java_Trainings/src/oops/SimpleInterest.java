package oops;

public class SimpleInterest {
	
	//void is used when method doesnt return anh value
	//but when method returns a value then use type of value as a return type
	
	
	public int getSimpleInterest(int p,int r,int t)
	{
		int si=p*r*t/100;
		return si;
	}
	
	//return statement can only return one value at a time
	public void mix(int a,int b)
	{
		int c=a+b;
		int d=a*b;
		//return c,d	//not allowed
		System.out.println(c);
		System.out.println(d);
	}
	//Forcefully return c & d in form of Array
	public int[] remix(int a,int b)
		{
			int k[]=new int[2];//k[0] k[1]	
			k[0]=a+b;
			k[1]=a*b;
			return k;
		}
	
}
