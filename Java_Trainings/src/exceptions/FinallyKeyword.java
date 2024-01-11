package exceptions;

public class FinallyKeyword {
//finally block contains the code which must be executed 
//either exception caught or not caught
	static int f1()
	{
		int a=5;
		try
		{
			System.out.println("Try Block");
			//throw new InterruptedException();//
			Thread.sleep(2000);
			return a;
		}
		catch(InterruptedException e) {
			System.out.println("Catch Block");
			return a;
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
	}
	public static void main(String[] args) {

		int h=f1();
		System.out.println("Main Method : "+h);
	}

}
