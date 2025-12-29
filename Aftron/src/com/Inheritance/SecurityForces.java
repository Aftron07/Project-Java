
package com.Inheritance;
public class SecurityForces{
	public static void main (String args[]) {
		Army army=new Army();
		System.out.print("");
		army.Protect();
		army.Tank();
		
		Navy navy=new Navy();
		navy.Protect();
		navy.Ship();
		
		AirForce air=new AirForce();
		air.Protect();
		air.Jets();
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