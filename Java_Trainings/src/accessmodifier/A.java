package accessmodifier;

public class A {

	int a;
	private void f1() {
		System.out.println("f1 of A");
	}
	void f2() {
		f1();
	}
	
}