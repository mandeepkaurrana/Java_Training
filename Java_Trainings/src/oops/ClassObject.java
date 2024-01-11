//OOPs - Object Oriented Programming System
package oops;

//real life objects - living/non-living/physical/non-physical

//Software				//Object		//Properties
//Student Mgt System	: Student 		rno,name,branch etc
//Library				: Book 			title, price, author, edition, publisher
//SalarySoft			: SalarySlip	month, variable, totalamt, netamt, pf
//LeavesSoft			: Leave			type, days, reason, fromdate, todate, status
//OPD					: Doctor		 
						//Patient		

//Separate method in class to work on Object properties
class Student
{
	int rno;				//Instance variable (can shared by each method of class)
	String name,branch;
	void setStudentValues(int r,String n,String b) {
		rno=r;				
		name=n;
		branch=b;
	}
	void printStudentValue() {
		System.out.println(rno);
		System.out.println(name);
		System.out.println(branch);
		
	}
}
public class ClassObject {

	public static void main(String[] args) {
		Student s=new Student();
		s.setStudentValues(101,"Anil","MCA");
		s.printStudentValue();
		
		Student t=new Student();
		t.setStudentValues(102,"Umesh","BCA");
		t.printStudentValue();
		
		
		
		
		
		
		

	}

}
