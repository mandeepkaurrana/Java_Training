package simpleprograms;

public class SelfPractice {

	public static void main(String[] args) {
		//WAP to print the radius of the circle
		double pie = 3.14;
		int rad = 30;
		double radius = pie * rad * rad;
		System.out.println("Radius of the circle is : " + radius);

		//WAP to print the find total marks & percentage
		int sub1 = 99, sub2 = 72, sub3 = 88, sub4 = 85, sub5 = 96;
		double totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
		double per = totalmarks / 500 * 100;
		System.out.println("Your Total marks are : " + totalmarks);
		System.out.println("Your Total percentage is : " + per);

		//WAP to print the total price, discount price for 20% & final payable bill
		int item1=500,item2=800,item3=1000;
		int totalprice= item1+item2+item3;
		double discPrice= totalprice/100*20;
		double payablebill= totalprice-discPrice;
		
		System.out.println("Total price : " + totalprice);
		System.out.println("Discounted price : " +discPrice);
		System.out.println("You have to Pay : " +payablebill);
		
	}

}
