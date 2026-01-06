package com.Polymorphism;
public class SuperClass{
	public static void main (String args[]) {
		Child c = new Child();
		c.disp();
		
	
	}
}
class Parent{
	int x=10;
	void disp() {
		System.out.println(x);
		
	}
}
class Child extends Parent{
	int x=20;
	void disp() {
		System.out.println(x);
		
		System.out.println(super.x);
}
}