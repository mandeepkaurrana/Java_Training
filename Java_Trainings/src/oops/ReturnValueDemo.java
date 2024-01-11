package oops;

public class ReturnValueDemo {

	public static void main(String[] args) {
		
		SimpleInterest s=new SimpleInterest();
		int kaka=s.getSimpleInterest(2000, 2, 3);
		
		System.out.println("Simple Interst : "+kaka);
		
		
		int arr[]=s.remix(2, 3);
		System.out.println("Sum : "+arr[0]);
		System.out.println("Product : "+arr[1]);
		
		AreaOfCircle ac=new AreaOfCircle();
		float k=ac.getArea(4);
		System.out.println(k);
		
		
		
		
	
	}

}
//Sum of array elements
//count even numbers from array
//String is palindrome or not


//print series 1 8 27 64 --- 1000


