package com.Polymorphism;

public class StudentApps {
	public static void main(String[] args) {
		Student s = new Student();
		s=null;
		Bike b =new Bike("Honda",150000, "Black");
//		s.hasA(b);
		System.out.println("===========================");
//		System.out.println(s.h.getJob()); //this is way to get access of object which is inside an object 
//		System.out.println(s.h.getWeight());
	}
}

class Student {
	Heart h =new Heart("To pump Blood",250.0);
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getprice());
		System.out.println(b.getcolour());
	}
}

class Heart {
	String Job;
	double Weight;
	
        public Heart(String Job,double Weight) {
	    this.Job = Job;
	    this.Weight = Weight;
	}
	

	public void setJob(String Job) {
		this.Job = Job;
	}

	public String getJob() {
		return Job;
	}

	public void setWeight(double Weight) {
		 this.Weight = Weight;
	}

	public double getWeight() {
		return Weight;
	}
}

class Bike {
	String Brand;
	int price;
	String colour;
	
        public Bike(String Brand, int power, String colour) {
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