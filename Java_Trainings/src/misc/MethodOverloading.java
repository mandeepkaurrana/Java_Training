package misc;
//same name method you can define in a class
//but either type of params will be different
//OR number of params will be different
class MyClass{
	
	void sum(int a,int b) 
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) 
	{
		System.out.println(a+b+c);
	}
	void sum(float a,float b)
	{
		System.out.println(a+b);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.sum(3,4);
		obj.sum(3.4f,6.7f);
		obj.sum(22,11,33);
		
		String s="hindustan";
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 7));

	}

}
