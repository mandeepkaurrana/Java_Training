package oops;

public class SumMain {

	public static void main(String[] args) {
		withoutmain sum= new withoutmain(); // Class calling using a object "object"
		// We call the methods of the class using the object we have declared in the main method
		sum.sumOfIntegers(12,12,12); //called or education inide the main method
		
		
		Factorial fac= new Factorial(); // Object of another class 
		fac.doFactorial(5); // Method of 2nd class is called here.
	}

}
