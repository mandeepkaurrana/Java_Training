package arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		
		int a[]= {11,44,22,55,33,77,66};//array declaration to allocate space and values also	
		int b[]=a;
				
		System.out.println("b array");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		//Copy One array in another another by updating each value by 5
		int c[]=new int[a.length];//array declarartion to allocate space only
		//c[0],c[1] --- c[6]
		
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+5;
		}
		
		System.out.println("c array");
		for(int i=0;i<c.length;i++) 
		{
			System.out.println(c[i]);
		}
		
		

	}

}
