package leftovers;
//Java runtime system, automatically release the memory occupied by unused and unreachable objects

//local variable goes to stack within method
//instance variable goes to heap within object

//stack memory					heap memory
//c=30	with method				Object of A class with a and b
//f1 pushed in stack					//when object will become unreachable
	//f1 popped from stack				//then it will garbage collectible after sometime
	//c will also destroyed				//instance variable also destroyed within object
class A1{
	int a,b; //instance variable
	void f1() {
		a=10;
		b=20;
		//int c=30; //local variable
	}
	
}

public class GarbageCollection {

	public static void main(String[] args) {
		A1 x=new A1();	//Object created in Heap Memory
		x.f1(); //when method called it goes to stack memory then popped after end curly brace
		x.f1();
		
		x=new A1();
		//or
		x=null;
		
		

	}

}
