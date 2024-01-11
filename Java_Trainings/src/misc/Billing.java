package misc;

public class Billing {

	public static void main(String[] args) {
		//3-item price, total bill, discount 20%, payable bill
		
		int a=400;
		int b=300;
		int c=800;
		
		int t=a+b+c;
		
		int d=t*20/100;
		
		int p=t-d;
		
		System.out.println("Total Bill : "+t);
		System.out.println("Discount : "+d);
		System.out.println("You have to pay : "+p);
		
		
		
		
		
	}

}
