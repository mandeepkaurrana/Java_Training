package oops;
//instance variable represent by this keyword
//when you have same name of local variables with instance variable

//Tightly coupled and low cohesive - avoid

//loosely coupled and highly cohesive


//instance variable must be declared as private
//so that they cant be directly accessible outside the class

//this feature is known as data hiding

//data encapsulation
//means method of same class can access the private data of that class

public class Book {
	private String title,author;
	private float price;
	private String publisher;
	public void setBookvalues(String title,String author,float price,String publisher) 
	{
		this.title=title;
		this.author=author;
		this.price=price;
		this.publisher=publisher;
		
	}
	public void getbookvalues() {
		System.out.println(title+" "+author+" "+price+" "+publisher);
	}
	
	
}
