package inheritance;
//Method Overriding
//its concerned with Inheritance
//When a sub class want to re-define the inherited method of super class
//but with same return type, same name and same no. of parameters
//only body of method can be change
class Doctor{
	void treatment() {
		System.out.println("Treat Patients in OPD");
	}
	void commisionOnTests() {
		System.out.println("Commision 10%");
	}
}
class Ortho extends Doctor{
	
}
class Dentist extends Doctor{
	void rctTreatment() {
		System.out.println("Rott Canal Treatment");
	}
}
class Surgeon extends Doctor
{
	@Override	//this annotation does not allow you to do illegal override
	void treatment() //Method Overriding
	{
		System.out.println("Treat Patient in OT");
	}
}
public class InheritanceMore {
	public static void main(String[] args) {
		//This happens only in inheritance

		//same type of reference variable
		//can hold the different type of objects
		
		//super class reference variable
		//can hold the object of its subclasses
		
		//This is called Polymorphism
		Doctor d;
		
		d=new Ortho();
		d.treatment();
		
		d=new Dentist();
		d.treatment();
		
		//**** for specific method of subclasses ****
		Dentist den=new Dentist();
		den.rctTreatment();
		//*******************************************
		
		d=new Surgeon();
		d.treatment();
		d.commisionOnTests();
		

	}

}
