package com.Inheritance;
public class InheritanceRule4{
	public static void main (String args[]) {
		Child c =new Child();
		
		
	}
}
class Parent{
	public Parent() {
		System.out.println("I am the parent constructor");
		
	}
}
class Parent2{
	public Parent2() {
		System.out.println("I am the parent2 constructor");
		
	}
}
class Child extends Parent,parent2{  // Syntax Error 
	public Child() {
	System.out.println("I am the Child constructor");
}