package com.encapsulation;
public class ShadowingProblem {
	public static void main(String[] args) {
		

		Student s = new Student(22,"hitu",45000);
		System.out.println(s.getid());
		System.out.println(s.getName());
		System.out.println(s.getsalary());
	}
}

class Student {
	private int id;
	private String name;
	private int salary;
	

	public Student(int id, String name,int salary) {
		this.id=id;
		this.name = name;
		this .salary=salary;
		
	}

	public int getid() {
		return id;
	}
	public String getName() {
		return name;
	}

	public int getsalary() {
		return salary;
	}

}


	