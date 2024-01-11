package arrays;

public class ArrayDemoTwo {

	public static void main(String[] args) {
		int a[]= {78,23,45,67,90,12,34,56};
		
		//traverse/iterate/visit
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=60)//78>60,23>60,45>60,67>60,90>60,	
			{
				c=c+1;	//c=1,2,3
			}
		}
		System.out.println("Above 60 count : "+c);

	}

}
