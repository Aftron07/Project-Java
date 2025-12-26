package com.encapsulation;


class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee(int i, String n,int s) {
		id=i;
		name = n;
		salary=s;
		
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
public class EmployeeApp {
	public static void main(String[] args) {
		

		Employee s = new Employee(22,"hitu",45000);
		System.out.println(s.getid());
		System.out.println(s.getName());
		System.out.println(s.getsalary());
	}
}
	