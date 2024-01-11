package accessmodifier;

class Laptop
{
	String company,model;
	float price;
	static int alpha=10;
	void setlaptop() {
		company="Dell";
		model="Vostro";
		price=34000;
		
	}
	void getlaptop() {
		System.out.println(company+" "+model+" "+price);
		
	}
	static void getSquare(int n) {
		System.out.println(n*n);
		//System.out.println(company);
		System.out.println(alpha);
	}

}
//main method is static, so that when we run program
//it can be called within the classname itself

public class StaticDemo {
	public static void main(String[] args) {
		Laptop p=new Laptop();
		p.setlaptop();
		p.getlaptop();
		
		
		Laptop.getSquare(5);
		
		
		
	}
}
