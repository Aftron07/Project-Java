package com.MethodOverriding;
class Parent1{
	static void disp() { // we add static in method 
		System.out.println("This is parent class");
		
	}
}
class Child1 extends Parent1{
	static void disp() {// we add static in method 
		System.out.println("This is Child class");
		
	}
}// this is the method Hiding 
class ParentAPPS1{
	public static void main (String args[]) {
		Parent1 P =new Parent1();
		P.disp();
		Child1 c =new Child1();
		c.disp();
		Parent1 P1 =new Child1();
		P1.disp();
	}
}