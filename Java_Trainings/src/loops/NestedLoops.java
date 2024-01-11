package loops;

//12345
//12345
//12345
public class NestedLoops {

	public static void main(String[] args) {
		
		for(int j=1;j<=3;j=j+1)			//Outer Loop
		{
			for(int i=1;i<=5;i=i+1)		//inner loop
			{
				System.out.print(i);
				
			}
			System.out.println();
			
		}
	
		//j=1	j<=3  true 		i=1 i<=5 complete	12345
		//j=2	j<=3  true		i=1 i<=5 complete 	12345
		//j=3   j<=3  true      i=1 i<=5 complete   12345
		//j=4   j<=3  false
		

	}

}
