package loops;
//*			//1			//odd - *
//*#		//12		//even - #
//*#*		//123
//*#*#		//1234

//*			//1
//##		//12
//***		//123
//####		//1234

public class DoubtTriangle {

	public static void main(String[] args) {
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c%2==0)
					System.out.print("java ");
				else
					System.out.print("python ");
			}
			System.out.println();
		}
		

	}

}
