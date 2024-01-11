package exceptions;
//Checked : Are Exceptions, which are checked at compile time and warn us that it can be occur at runtime
//so please handle such exceptions using try & catch keywords
//checked exception are declared by java library methods which are risky in behavior

//Unchecked : Are exceptions, which are not checked at compile time and occur at runtime
//such exceptions are programming fault so it should be resolved by user itself
//we never use tyr/catch to handle unchecked exceptions
public class ThrowsKeyword {

	static void f1()throws InterruptedException 
	{
		System.out.println("hello");
		Thread.sleep(2000);
		System.out.println("hi");
	}
	public static void main(String[] args)
	{
		try{
			f1();
		
		}
		catch(InterruptedException e) {
			System.out.println("f1 failed due to ");
		}

		try {
			f1();
		}
		catch(InterruptedException e) {
			System.out.println("f1 failed due to ");
		}
		
		
		
	}

}
