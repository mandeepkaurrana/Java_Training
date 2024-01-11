package oops;


//Constructor
//which looks like a method but not a method
//Which automatically called when object is created
//which have the same name as class name
//for which we never use void keyword
//which is basically used to initialize instance variable
//Constructor is of two types - default and parameterized
class Pen
{
	private String compnay;
	private String model;
	private float price;
	
	public Pen()//default
	{
		compnay="Montex";
		model="gripper";
		price=20;
	}
	//Parameterized
	public Pen(String company,String model, float price)
	{
		this.compnay=company;
		this.model=model;
		this.price=price;
	}
	
	public void setPenvalues(String company,String model, float price) {
		this.compnay=company;
		this.model=model;
		this.price=price;
	}
	
	public void getPenValues() {
		System.out.println("Pen Company : "+compnay);
		System.out.println("Pen Model : "+model);
		System.out.println("Pen Price : "+price);
		
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Pen p=new Pen();//default constructor invoked
		p.getPenValues();
		
		Pen k=new Pen("Cello","hifi",30);//Parameterized constructor will be invoked
		k.getPenValues();
		
		Pen h=new Pen();//first it will set default values through constructor
		h.setPenvalues("Reynolds", "India", 30);
		h.getPenValues();
			
	}

}


//Note: if you dont have default constructor and have only param
//constructor

//then you cant create empty object like
	//Pen p=new Pen();

//becz new Pen() will search for a body like 

		//Pen()
			//{
		
			//}










