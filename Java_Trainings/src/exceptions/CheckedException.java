package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			//System.out.println(i);
			
			/*
			 * try { Thread.sleep(2000); } catch(InterruptedException e) {
			 * System.out.println("Exception Occur "+e); }
			 */
		}
		
		try
		{
		 FileInputStream f=new FileInputStream("c:\\hello\\abc.txt");
		 System.out.println("inside Try");
		}
		catch(FileNotFoundException e) 
		{
			
		}
		
		System.out.println("hello");
		
		
		

	}
	
	
	
	

}
