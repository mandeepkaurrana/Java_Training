package oops;

public class LibraryTest {
	//Library: Book 	title, price, author, edition, publisher
	String title; // null value by default
	String author; // null value by default
	String publisher; // null value by default
	
	public void setBookDetails(String a,String b,String c)// The string parameters a,b & c which are declared here will be assigned the string type value in the main method
	{ // abc are local variables
		// this key
		title = a;
		author = b;
		publisher= c;
	}
	public void getBookDetails()
	{
		System.out.println("The Book Title is : "+title);
		System.out.println("The author of the book is : "+author);
		System.out.println("This book is published by : "+publisher);
	}
	
}
