package com.encapsulation;



public class Employee extends Object {
	private int id;
	private String name;
	private int salary;
	

	public Employee(int id, String name,int salary) {
		super();
		this.id=id;
		this.name = name;
		this .salary=salary;	
	}
	
	public Employee() {
		super();
		this(22,"Aftab",45000);
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
	public class Object{
		public Object () {
			
		}
	}

}

public class DefaultConstructor {
	public static void main(String[] args) {
		
		
		
		Employee e = new Employee();
		System.out.println(e.getid());
		System.out.println(e.getName());
		System.out.println(e.getsalary());

		Employee e1 = new Employee(22,"Aftab",45000);
		System.out.println(e1.getid());
		System.out.println(e1.getName());
		System.out.println(e1.getsalary());
	}
}


	