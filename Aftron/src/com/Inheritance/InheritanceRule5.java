package com.Inheritance;
public class InheritanceRule5{
	public static void main (String args[]) {
		Child c =new Child();
		System.out.println(c.a);
		System.out.println(c.b);
	}
} // Multi-Level Inheritance
class GrandParent{
	int a=10;
}
class Parent extends GrandParent{
	int b = 20;
}
class Child extends Parent{  
}