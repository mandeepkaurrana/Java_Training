package inheritance;
		   //derived class	//base class
		   //Sub class		//Super class	 
           //Child class	//Parent Class			
public class Teacher extends PostalAddress{
	private String name;
	private String subject;
	public void setTeacherValues(String name,String subject) 
	{
		this.name=name;
		this.subject=subject;
	}
	void getteacherDetail() {
		System.out.println(name);
		System.out.println(subject);
	}
	
	
	
}
