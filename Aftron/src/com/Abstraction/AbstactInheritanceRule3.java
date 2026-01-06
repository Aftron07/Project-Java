package com.Abstraction;
public class AbstactInheritanceRule3{
	public static void main (String args[] ) {
		
		
	}
	
}
abstract class Bird{
	abstract void eat ();
	abstract void fly();
}
class Spprrow extends Bird{// showing error here 

	void fly() {
		System.out.println("sparrow is flying");
	}
}
//3.	A child class inheriting from an abstract class must implement (Override ) the abstract method present in the parent class.


