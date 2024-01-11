package remix;

public class MixLoops {

	public static void main(String[] args) {
		
		
		for(int a=1;a<=5;a=a+1) //entry controlled
		{
			System.out.println(a);
		}
		
		System.out.println("***************");
		int b=1;
		while(b<=5)				//entry controlled
		{
			System.out.println(b);
			b=b+1;
		}
		
		
		System.out.println("***************");
		//do-while loop execute at-least one time either condition is false
		
		int c=1;
		do						//exit controlled
		{
			System.out.println(c);
			c=c+1;
			
		}while(c<=5);
			
	
	
	}

}
