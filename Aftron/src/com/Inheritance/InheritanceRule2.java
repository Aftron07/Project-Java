package com.Inheritance;
public class InheritanceRule2{
	public static void main (String args[]) {
		Child c =new Child();
		System.out.println(c.a);
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		c.disp();
		
	}
}
//the private members of the class does not participate in inheritance 

class Parent{
	private int a=10;
	int b=20;
	private void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}
class Child extends Parent{
	
}