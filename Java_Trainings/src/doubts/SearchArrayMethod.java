package doubts;
public class SearchArrayMethod {
	public static void main(String[] args) {
		int a[]= {44,66,22,88,11,99,33};
		int k=90;
		ArrayOperation aop=new ArrayOperation();
		boolean flag=aop.searchElementFromArray(a,k);
		if(flag==true)
			System.out.println("Found");
		else
			System.out.println("not Found");
		
		
		int count=aop.countEvenNumbers(a);
		System.out.println(count);
	}
}
//10th Aug
//otherwise you never get the automation framework flow