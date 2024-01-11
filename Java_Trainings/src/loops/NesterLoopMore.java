package loops;


public class NesterLoopMore {

	public static void main(String[] args) {
		for(int r=1;r<=5;r=r+1)			//Outer Loop
		{
			for(int c=1;c<=r;c=c+1)		//inner loop
			{
				System.out.print(c+" ");
				
			}
			System.out.println();
			
		}
		
		//j=1 j<=5 true i=1 i<=1	1
		//j=2 j<=5 true i=1 i<=2    12
		//j=3           i=1 i<=3    123 
		//j=4           i=1 i<=4    1234
		//j=5           i=1 i<=5    12345

	}

}
