package leftovers;
//deadly diamond death
class Animal{
	void eat() {
		
	}
}
class Pet{
	void eat() {
		
	}
}
interface Pets{
	void eat();
}
//class Dog extends Animal,Pet
//{
	
//}
//confusion for taking decision to call the inherited method from more than one base class
//Ambiguity

class Dog extends Animal implements Pets{
	public void eat() {
		
	}
}

public class AmbiguityIssue {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();

	}

}
