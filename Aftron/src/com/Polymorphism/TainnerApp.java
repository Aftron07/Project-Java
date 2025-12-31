package com.Polymorphism;
public class TainnerApp{
	public static void main (String args[]) {
		Trainer t;
		t=new JavaTrainer();
		t.Teach();
		t=new Apti();
		t.Teach();
		
		t=new Testing();
		t.Teach();
	}
	
}
class Trainer{
	void Teach(){
		
		System.out.println("To protect");
	}
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