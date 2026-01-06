package com.MethodOverriding;
class Parent{
	void disp() {
		System.out.println("This is parent class");
		
	}
}
class Child extends Parent{
	void disp() {
		System.out.println("This is Child class");
		
	}
}// this is the method OVerriding 
class ParentAPPS{
	public static void main (String args[]) {
		Parent P =new Parent();
		P.disp();
		Child c =new Child();
		c.disp();
		Parent P1 =new Child();
		P1.disp();
	}
}