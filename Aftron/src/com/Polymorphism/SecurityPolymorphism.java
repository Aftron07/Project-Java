
package com.Polymorphism;


public class SecurityPolymorphism{
	public static void main (String args[]) {
		
		duty(new Army() );
		duty(new Navy() );
		duty(new AirForce() );
		
		
	}
	static void duty(SecurityForcess p) {
		p.Protect();
		
	}

}
class SecurityForcess{
	void job(){
		
		System.out.println("To protect");
	}
	void Protect() {
		
		System.out.println("To protect Peoples");
	}
}
class Army extends SecurityForcess{
	
	void Tank() {
		System.out.println("Army Uses Tanks");
	}
	
}

class Navy extends SecurityForcess{
	
	
	void Ship() {
		System.out.println("Navy uses Ships");
	}
	
}

class AirForce extends SecurityForcess{
	
	void Jets() {
		System.out.println("Air force uses Jets");
	}
	
}



