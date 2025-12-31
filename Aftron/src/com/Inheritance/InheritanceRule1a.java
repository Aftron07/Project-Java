package com.Inheritance;
class InheritanceRule1a{
	Animal disp1() {
		Animal a= new Animal();
		System.out.println("Animalll");
		return a;
	}
}
 class Child1a extends InheritanceRule1a{
	 Dog disp1() {
		Dog d= new Dog();
		return d;
	 }
 }
 class Animal{
	 
 }
 class Dog extends Animal{
	 
 }