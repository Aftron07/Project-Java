package com.Polymorphism;

public class StudentsApps {

	public static void main(String[] args) {
		Student1 s = new Student1();
		Bike1 b = new Bike1("Hero",110000,"Black");
		Book1 k = new Book1("History","Brown");
		System.out.println("===========Bike==============");
		s.hasA(b);
		System.out.println("===========Book==============");
		s.hasA(k);
		System.out.println("============Heart============");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getweight());
		System.out.println("=============Brain============");
		System.out.println(s.r.getJob());
		System.out.println(s.r.getweight());
	}

}

class Human {
	Heart1 h = new Heart1("Pump",250);
	Brain1 r = new Brain1("Command",350);
}

class Student1 extends Human{
	void hasA(Bike1 b) {
		System.out.println(b.getBrand());
		System.out.println(b.getprice());
		System.out.println(b.getcolour());
	}
	void hasA(Book1 k) {
		System.out.println(k.getName());
		System.out.println(k.getcolour());
	}
}

class Heart1 {
	String Job;
	float weight;
	
        public Heart1(String Job, float weight) {
	    this.Job = Job;
	    this.weight = weight;
	}
	

	public void setJob(String Job) {
		this.Job = Job;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(float weight) {
		this.weight = weight;
	}

	public float getweight() {
		return weight;
	}
}

class Bike1 {
	String Brand;
	int price;
	String colour;
	
        public Bike1(String Brand, int price, String colour) {
        super();
	    this.Brand = Brand;
	    this.price = price;
	    this.colour = colour;
	}
	

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}

	public String getBrand() {
		return Brand;
	}

	public void setprice(int price) {
		 this.price = price;
	}

	public int getprice() {
		return price;
	}
	public void setcolour(String colour) {
		 this.colour = colour;
	}

	public String getcolour() {
		return colour;
	}
}

class Book1 {
	String Name;
	String colour;
	
        public Book1(String Name, String colour) {
	    this.Name = Name;
	    this.colour = colour;
	}
	

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setcolour(String colour) {
		this.colour = colour;
	}

	public String getcolour() {
		return colour;
	}
}

class Brain1 {
	String Job;
	int weight;
	
        public Brain1(String Job, int weight) {
        super();
	    this.Job = Job;
	    this.weight = weight;
	}
	

	public void setJob(String Job) {
		this.Job = Job;
	}

	public String getJob() {
		return Job;
	}

	public void weight(int weight) {
		 this.weight = weight;
	}

	public int getweight(){
		return weight;
	}
}