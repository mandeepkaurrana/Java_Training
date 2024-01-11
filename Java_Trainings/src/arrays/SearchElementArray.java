package arrays;

public class SearchElementArray {

	public static void main(String[] args) {
		int a[]= {11,33,22,66,55,88,44};
		int k=66;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element Not Found");
		}
		else
		{
			System.out.println("ELement Found");
		}
		

	}

}
