package inheritance;

//if there is a parameter cons in super class
//then you need to explicitly pass the value to that constructor
//from sub class constructor using super keyword
class A{
	int a;
	A(int a){
		this.a=a;
		System.out.println("Param Cons - A Class ");
	}
}
class B extends A{
	B(){
		super(4);
		System.out.println("Default Cons -B Class "+a);
		
	}
}
public class ConsInheritance {

	public static void main(String[] args) {
		B x=new B();
		x.a =5;
}
}













