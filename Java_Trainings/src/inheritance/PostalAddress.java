package inheritance;

//As private data can't be inherited
//so we declare protected data in super class
//Protected data in super class
//can only be accessible in its sub classes
public class PostalAddress{
	 protected String hno;
	 protected String street,city;
	public void setPostalAddressValues(String hno,String street, String city) 
	{
		this.hno=hno;
		this.street=street;
		this.city=city;
	}
	public void getPostalAddress() {
		System.out.println(hno+" "+street+" "+city);
	}
	

}
