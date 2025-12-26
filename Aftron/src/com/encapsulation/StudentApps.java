package com.encapsulation;

import java.util.Scanner;



public class StudentApps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your name :");
		String s = sc.next();
		System.out.println("enter your age :");
		int a = sc.nextInt();
		System.out.println("enter your gender :");
		String g = sc.next();

		Student s1 = new Student();
		s1.setData(s, a, g);

		System.out.println("your name is:" + s1.getName());
		System.out.println("your age is:" + s1.getage());
		System.out.println("your gender is:" + s1.getgender());
	}
}
class Student {
	private String name;
	private int age;
	private String gender;

	public void setData(String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}

	public String getName() {
		return name;
	}

	public int getage() {
		return age;
	}

	public String getgender() {
		return gender;
	}
}
	