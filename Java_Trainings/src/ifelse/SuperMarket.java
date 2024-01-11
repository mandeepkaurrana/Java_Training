package ifelse;

//price of 3-items
//calculate total bill
//calculate discount
	//total bill <1000	- no discount
	//total bill >=1000	- 10%
	//total bill >=3000 - 30%
	//total bill >=5000	- 50%

//calculate the payable bill
//Nested if -Else
//When one if condition is depend on the evaluation of another if condition
//Note :
//if we have more than one statement under if or else
//then body of curly brace is must

//however for single statement java recommend to use body
public class SuperMarket {

	public static void main(String[] args) {
		int item1=3000, item2=100, item3=200;
		int total=item1+item2+item3;
		int discount=0;
		if(total>=5000) 
		{
			discount=total*50/100;
		}
		else if(total>=3000)
		{
			discount=total*30/100;
		}
		else if(total>=1000)
		{
			discount=total*10/100;
		}
		else  //This is optional as discount already declare with zero 
		{
			discount=0;
		}
		
		int payamount=total-discount;
		
		System.out.println("Total Bill : "+total);
		System.out.println("Discount Given : "+discount);
		System.out.println("you have to Pay : "+payamount);
		
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
  







 













