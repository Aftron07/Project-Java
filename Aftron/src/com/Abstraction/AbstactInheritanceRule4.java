package com.Abstraction;
public class AbstactInheritanceRule4{
	public static void main (String args[] ) {
		duty(new vegSparrow());
		duty(new nonVegSparrow());
		
		
	}
	static void  duty(Bird b) {
		b.eat();
		b.fly();
	}
	
}
abstract class Bird{
	abstract void eat ();
	abstract void fly();
}
abstract class Sparrow extends Bird{
	// showing error here 

	void fly() {
		System.out.println("sparrow is flying");
	}
}
class vegSparrow extends Sparrow{
	void eat() {
		System.out.println("veg sparrow eat grain ");
	}
	
}
class nonVegSparrow extends Sparrow{
	void eat() {
		System.out.println("veg sparrow eat worms ");
	}
	
}
//4.	If a child class only partially implemented in method of an abstract class the child class itself should also be abstract;



