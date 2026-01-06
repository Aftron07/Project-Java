package com.Abstraction;



public class TrainerApps{
	public static void main (String args[]) {
		duty(new JavaTrainer() );
		duty(new Apti());
		duty(new Testing());
	}
	static void duty(Trainer t) {
		t.Teach();
	}
	
}
 abstract class Trainer{
	 abstract void Teach();
		
		
}
class JavaTrainer extends Trainer{
	
	void Teach() {
		System.out.println("It teches JAVA");
	}
	
}

class Apti extends Trainer{
	
	
	void Teach() {
		System.out.println("It teches Apti");
	}
	
}

class Testing extends Trainer{
	
	void Teach() {
		System.out.println("It teches Testing");
	}
	
}

// In the above example it is certain the protect method  of Security force class shall always be overwritten by the child classes
//hence there is no need of the method in the security force class(Parent).
//but if we tried to remove the method from the parent class the corresponding method present in the child class will become specialized 
//as a parent type reference cannot access the specialized method of the child class so that we will not be able to 
//in the above program we used abstraction 
//such method which has only signatures and not the body are known as incomplete method or Abstract method 
// to declare method as abstract we must used Abstract Keyword
//in java if a class has even a single abstract method the class itself must be declared as abstract 
// the biggest advantage of having abstract method is that their is no body hence less memory is occupied 
// the corresponding method in child class remains overwrriden hence the benifit of polymorphism could still be achieved 