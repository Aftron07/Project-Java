package com.Abstraction;
import java.util.Scanner;

public class AreaApps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int a= sc.nextInt();
		System.out.println("Enter sides of Square");
		float b= sc.nextInt();
		System.out.println("Enter height of triangle");
		int p= sc.nextInt();
		System.out.println("Enter base of triangle");
		int q= sc.nextInt();

		
		disp(new Circle(a));
		disp(new Square(b));
		disp(new Triangle(p, q));

	}
	static void disp(Shapes s) {
		s.dispArea();
	}

}
abstract class Shapes{
	static final float PI = 3.14f;
	static float half = 0.5f;
	abstract float findArea();
	abstract void dispArea();
}
class Circle extends Shapes{
	private float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}
	float findArea() {
		return PI*(radius*radius);
		
	}
	void dispArea(){
		
		System.out.println("Area Of circle : "+findArea());
		}
}
class Square extends Shapes{
	private float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}
	float findArea() {
		return side* side;
	}
	void dispArea() {
		System.out.println("Area Of Square : "+findArea());
	}
}
class Triangle extends Shapes{
	private float base;
	private float height;
	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}
	public float getBase() {
		return base;
	}
	public float getHeight() {
		return height;
	}
	float findArea() {
		return half * base*height;
	}
	void dispArea() {
		System.out.println("Area Of Triangle : "+findArea());
	}
	
}