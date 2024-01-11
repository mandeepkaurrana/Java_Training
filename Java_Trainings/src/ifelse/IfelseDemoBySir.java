package ifelse;
//we use if-else when we have to take decision on statement which has to be execute
//to do the comparison we use operators < <= > >= == !=
//we never use semicolon with if and else

//we have to define body for if and else separately
//we avoid to declare a variable inside if or else body
		//becz they cant be accessible outside the body
public class IfelseDemoBySir {

	public static void main(String[] args) {
		
		//3-item price, total bill, 
		//total bill<1000 then discount 10%
		//total bill>=1000 then discount 20%
		//payable bill
					
		int a=300,b=400,c=200;
		int totalbill=a+b+c;
			
		int d=0;//declare d only one time
		
		//here 20 no & 24 no based on evaluation of 18no line
		if(totalbill>=1000)
		{
			d=totalbill*20/100;//true
		}
		 else 
		 { 
			 d=totalbill*10/100;//false 
		 }
				
		int p=totalbill-d;
		
		System.out.println("Total Bill :--> "+totalbill);
		System.out.println("Discount is :--> "+d);
		System.out.println("You have to pay :--> "+p);
		
		
		}

}


























