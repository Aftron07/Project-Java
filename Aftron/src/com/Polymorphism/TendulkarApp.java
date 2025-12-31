package com.Polymorphism;
public class TendulkarApp{
	public static void main (String args[]) {
		t.job();
		t.profession();
		t.smoke();
		
		
		}
	
}
class Tendulkar{
	void job(){
		
		System.out.println("Play cricket");
	}
	void profesion() {
		System.out.println("He is Batsman");
	}
	
}
class ArjunTendular extends Tendulkar{
	void job(){
		
		System.out.println("Play cricket");
	}
	void profesion() {
		System.out.println("He is Baller");
	}
	
	void smoke() {
		
	}
}

