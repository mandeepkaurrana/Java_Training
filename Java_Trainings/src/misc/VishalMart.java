package misc;
//price of 3-items
//calculate total bill
//calculate discount
	//total bill <1000	- no discount
	//total bill >=1000	- 10%
	//total bill >=3000 - 30%
	//total bill >=5000	- 50%

//calculate the payable bill
public class VishalMart {

	public static void main(String[] args) {
		int a=100;
		int b=500;
		int c=100;
		
		int t=a+b+c;
		
		//its good practice to initialize zero in local variable
		int d=0;
		if(t>=5000)
		{
		  d=t*50/100;
		}
		else if(t>=3000)
		{
		  d=t*30/100;
		}
		else if(t>=1000)
		{
			d=t*10/100;
		}
		else {
			d=0;
		}
		
		int p=t-d;
		
		System.out.println("Total Bill : "+t);
		System.out.println("Discount : "+d);
		System.out.println("You have to pay : "+p);

	}

}

/*
* You need to enter start and end reading of an electricity meter, 
* calculate the consumed units. 
- Then calculate the bill as per the following conditions
	units<100 	5.25/unit
	units>=100 	6.50/unit
	units>=400 	7.75/unit
	units>=700	 8.50/unit


* Enter the marks of 5-Subjects, calculate the total and percentage of marks. 
- Then print the result as per following conditions
	percentage>=75 	Merit
	percentage>=60 	First
	percentage>=50 	Second
	percentage>=40 	Pass
	percentage<40 	ReAppear
*/
