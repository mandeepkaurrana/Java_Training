package arrays;

public class ArrayDemoThree {

	public static void main(String[] args) {
		//23,45,12,67,89,34,78,14
		
		int a[]= {23,45,12,67,89,34,78,14};
		
		int m=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(m<a[i])//23<23,23<45,45<12,45<67,67<89,89<34-----
			{
				m=a[i];//m=45,67,89
			}
		}
		System.out.println("Largest "+m);
						

	}

}
