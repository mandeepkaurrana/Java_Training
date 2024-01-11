package loops;
//1
//121
//12321
//1234321
//123454321
public class Triangle121 {

	public static void main(String[] args) {
		
		for(int r=1;r<=5;r++)		//r=4
		{
			for(int c=1;c<=r;c++)		//c=1 to 4  - 1234
			{
				System.out.print(c);
			}
			for(int k=r-1;k>=1;k--)		//k=r-1 - k=3 to 1 - 321
			{
				System.out.print(k);
			}
			
		System.out.println();	
		}
		
	}

}
