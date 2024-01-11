package loops;

//1
//12
//123
//1234
//12345
//123456
//1234567

public class SpaceTriangle {

	public static void main(String[] args) {
		
		for(int r=1;r<=7;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==7||c==r)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
