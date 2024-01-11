package leftovers;
//Single : When one class inherit another class		
	class A{
		
	}
	class B extends A{
		
	}
//Multilevel : When one subclass further inherited by another class
	class C{				//granparent
		
	}
	class D extends C{		//Parent
		
	}
	class E extends D{		//child
		
	}
	//C x=new E();  //allowed
	
//multiple : More than one super classes inheriting by One class 
	class K{
		
	}
	class H{
		
	}
	//class MK extends H,K //Not Allowed for classes
	interface P{
		
	}
	interface J{
		
	}
	//class MK extends K implements P //Allowed
	//class SK implements P,J  //Allowed
	
//Hierarchical : One Super class can be inherited by more than one subclasses
	class Doctor{
		
	}
	class Dentist extends Doctor{
		
	}
	class Surgeon extends Doctor{
		
	}

//Hybrid : could be a combination of single, multilevel, multiple and hierarchical

class StudentAdmissionData{
	
}
class StudentHostal extends StudentAdmissionData{
	
}
class StudentMess extends StudentHostal{
	
}
class HostalLibrary extends StudentHostal{
	
}


public class InheritanceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
