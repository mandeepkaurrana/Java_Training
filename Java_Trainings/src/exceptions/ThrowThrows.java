package exceptions;

import java.io.IOException;

//throw keyword is used to throw /pass the exception to java runtime system
//throws keyword used to announce/declare the exception to handle at compile time
class A{
	/*
	void sleep() throws InterruptedException
	{
		throw new InterruptedException();
	}
	*/
	void f1()throws IOException 
	{
		int age=19;	
		if(age<18)
			throw new IOException();
		else
			System.out.println("hello eligible candidate");
	}
}
public class ThrowThrows {

	public static void main(String[] args) {
		A x=new A();
		try
		{
			x.f1();
		}
		catch(IOException exp) {
			System.out.println("Exception Occur");
		}
		
			
	}

}
