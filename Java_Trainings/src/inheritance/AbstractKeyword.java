package inheritance;
//Method Overriding
//depends on requirement - roam()	
//restrict - sleep()
//mandatory to override  eat()

//abstract method is mandatory to override
//abstract method doesn't not have any body
//its terminated by semicolon
//a class which contains abstract method must be declared as abstract itself

//so that no one can create object of abstract class

//final method in super class cant be override
//We can write constructor in Abstract class
//abstract method can be parameterized

//final variable, final methods, final class

abstract class Animal{
	public abstract void eat();
	
	public final void sleep() {
		System.out.println("Sleep in Night");
	}
	public void roam() {
		System.out.println("Roam in Streets");
	}
}
class Dog extends Animal
{
	public void eat() {
		System.out.println("Eat Chicken");
	}
}
class Cat extends Animal
{
	public void eat() {
		System.out.println("Drink Milk");
	}
	
}
public class AbstractKeyword {

	public static void main(String[] args) {
			Animal a;
			a=new Dog();
			a.eat();
			a.sleep();
			a.roam();
			
			a=new Cat();
			a.eat();
			a.sleep();
			a.roam();
			
			
			

	}

}
