package accessmodifier;

//private : accessible within the class only
//public : accessible anywhere in the project
//protected : accessible outside the package but only with Inheritance

//default level : accessible within the package only

//Classes always public
//Methods 90% public, 10% private or Protected
//Data : 99% private and protected

import otherpackage.C;

public class MainClass {

	public static void main(String[] args) {
		A x=new A();
		x.f2();
		C y=new C();
		y.f2();
	}

}
