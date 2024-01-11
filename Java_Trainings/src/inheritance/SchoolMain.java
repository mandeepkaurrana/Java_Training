package inheritance;


//We can invoke the super class methods with Sub class object
//we can access the instance variable of super class in the method of subclass


public class SchoolMain {

	
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.setTeacherValues("Yogita", "English");
		t.setPostalAddressValues("123", "ABC City", "Mohali");
		t.getteacherDetail();
		t.getPostalAddress();
		
		
		Student s=new Student();
		s.setStudentValues("Yaman", "MCA");
		s.setPostalAddressValues("321", "Aman City", "Mohali");
		s.getStudentvalues();
	}
}


//RBIBank - fdrate, homeloanrate

//HDFC inherit RBIBank
//ICICI inherit RBIbank

//BankMain - psvm
		//club


//Doctor - treatment() qualification, Hospital 
	//Surgeon		specialization
	//Ortho
	//Dentist

//DoctorMain
	//club













