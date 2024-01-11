package inheritance;
//
//If you have an abstract class which have only abstract methods
//then declare it as interface
//interface is same like a abstract class
//but it contains only abstract methods

//we use implements keyword to inherit the interface
//a one class can extends a class as well as implmenets interface also

//somewhere it resolve the multiple inheritance problem 
//more than one interface can be implemented

abstract class HDFCLIfe{
	void f1() {
		System.out.println("HDFC Life");
	}
	abstract void f2();
}

interface RBIBank{
	void fdRate();
	void homeLoanRate();
}
class HDFCBank extends HDFCLIfe implements RBIBank{
	@Override
	public void fdRate() {
		System.out.println("HDFC FD Rate 6%");
		
	}
	@Override
	public void homeLoanRate() {
		System.out.println("HDFC HomeLoan Rate 9.3%");
		
	}
	@Override
	void f2() {
		
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		RBIBank bank=new HDFCBank();
		bank.fdRate();
		bank.homeLoanRate();
		HDFCBank b=new HDFCBank();
		b.f1();
		
	}

}
