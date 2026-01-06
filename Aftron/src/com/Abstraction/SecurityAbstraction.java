package com.Abstraction;


public class SecurityAbstraction{
	public static void main (String args[]) {
		
		duty(new Army() );
		duty(new Navy() );
		duty(new AirForce() );
		
		
	}
	static void duty(SecurityForcess p) {
		p.protect();
		
	}

}
abstract class SecurityForcess{
	abstract void protect();
	
}
class Army extends SecurityForcess{
	
	void protect() {
		System.out.println("Army Uses Tanks");
	}
	
}

class Navy extends SecurityForcess{
	
	
	void protect() {
		System.out.println("Navy uses Ships");
	}
	
}

class AirForce extends SecurityForcess{
	
	void protect() {
		System.out.println("Air force uses Jets");
	}
	
}



