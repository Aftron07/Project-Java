package com.Inheritance;
public class InheritanceRule3{
	public static void main (String args[]) {
		Child c =new Child();
	}}


//the constructor of class also do not participate inheritance however the parent class constructor is called because of constructor chaining 
 class Parent{
	public Parent() {
		System.out.println("I am the parent constructor");
		
	}
}
class Child extends Parent{
	public Child() {
	System.out.println("I am the Child constructor");
}
}
