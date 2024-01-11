package exceptions;

//Compile Time Errors - Syntax Error	
//Run Time Error - Exception

//Exception is a run time error which interrupt the execution flow 
//of your program

//ArrayIndexOutOfBoundsException
//AritmeticException
//NullPointerException

//Did Compiler warns you that this exception may/will occur? NO
//NO
//Such exception are known as Unchecked Exception

class Student
{
	String name;
	void getLengthofStudentName() {
		System.out.println(name.length());
	}
}
public class UncheckedException {
	public static void main(String[] args) {
		
		int a[]= {11,22,33,44};
		System.out.println(a[4]);
		
		
		int b=5,c=2;
		if(c>0)
			System.out.println(b/c);
		else
			System.out.println("cant divide by Zero");
		
		
		Student s=new Student();
		s.getLengthofStudentName();
	}
}
