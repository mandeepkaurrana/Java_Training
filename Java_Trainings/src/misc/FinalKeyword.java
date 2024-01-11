package misc;
//final variable : cant modify
//final methods : cant override
//final classes : cant inherit
final class Pen{
	
}
//Cant Inherit but we can create object of final class and access its methods
//class FountainPen extends Pen{
	
//}
class Toy{
	int a,b;
	final int c=345;
	void f1() {
		a=10;
		b=20;
		//c=90;
	}
	void f2() {
		a=a+34;
		b=b*6;
		//c=c+7;
	}
	final void finalMethod() 
	{
		System.out.println("final Method");
	}
	
}
class CricketToy extends Toy{
	void hello() {
		System.out.println(a+ "" +" "+b+ " "+c);
	}
	
	//cant override
	//void finalMethod() {
		
	//}
}
public class FinalKeyword {

	public static void main(String[] args) {
		System.out.println(FinalStaticVariable.INDIA);
		
		String day="sunday";
		
		if(day.equalsIgnoreCase(Day.SUNDAY))
		{
			
		}
		else if(day.equalsIgnoreCase(Day.MONDAY)) {
			
		}
		
		

	}

}
