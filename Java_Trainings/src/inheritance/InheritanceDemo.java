package inheritance;
//ReUsability Concept
//When our class want to re-use the existing code

class Bank{
	float fdrate=6.5f;
	void getFDrate() {
		System.out.println("FD Rate : "+fdrate);
	}
}
class HDFC extends Bank{
	public void hdfcLife() {
		System.out.println("hdfc life advatage plus for 10yr");
	}
}

class ICICI extends Bank{
	
}
public class InheritanceDemo {
	public static void main(String[] args) {
		HDFC hdfc=new HDFC();
		ICICI icici=new ICICI();
		
		hdfc.getFDrate();
		hdfc.hdfcLife();
		
		icici.getFDrate();

	}

}
