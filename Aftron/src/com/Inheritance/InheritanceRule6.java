package com.Inheritance;
public class InheritanceRule6{
	public static void main (String args[]) {
		Child c =new Child();
		
	}
} // Cyclic Inheritance is not allowed

class Parent extends Child{
	int b = 20;
}
class Child extends Parent{  
}
