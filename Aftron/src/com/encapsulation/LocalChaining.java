package com.encapsulation;
 class Employee3{
	int emp_id;
	String name;
	int Salary;
	
	public  Employee3() {
		this(101,"aftab",20);
	System.out.println("0 parameterize constructor is called");
	}
	
	public Employee3(int emp_id) {
//		super()
	System.out.println("1 parameterize constructor is called");
	}
	public  Employee3(int emp_id,String name) {
		this(101);
	System.out.println("2 parameterize constructor is called");
	}
	public  Employee3(int emp_id,String name,int salary) {
		this(101,"aftab");
	System.out.println("3parameterize constructor is called");
	}
}
public class LocalChaining {
	public static void main(String[] args) {
		Employee3 e= new Employee3();
		
	}
		
	}