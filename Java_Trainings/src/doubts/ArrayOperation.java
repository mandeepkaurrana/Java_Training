package doubts;
public class ArrayOperation {
	public boolean searchElementFromArray(int a[],int k)	{
		boolean flag=false;
		for(int i=0;i<a.length;i++)	{
			if(a[i]==k)	{
				flag=true;
				break;
			}
		}
		return flag;
	}
	public int countEvenNumbers(int a[]) {
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c=c+1;
			}
		}
		return c;
		
	}
}
