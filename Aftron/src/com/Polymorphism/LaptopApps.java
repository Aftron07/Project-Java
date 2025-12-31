package com.Polymorphism;

public class LaptopApps {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		Charger c =new Charger("Hp",150);
		l.hasA(c);
		System.out.println("===========================");
		System.out.println(l.os.getBrand()); //this is way to get access of object of inside an object 
		System.out.println(l.os.getversion());
	}
}

class Laptop {
	Os os=new Os("Windows",10.0);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getpower());
	}
}

class Os {
	String Brand;
	double version;
	
        public Os(String Brand, double version) {
	    this.Brand = Brand;
	    this.version = version;
	}
	

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}

	public String getBrand() {
		return Brand;
	}

	public void setversion(double version) {
		 this.version = version;
	}

	public double getversion() {
		return version;
	}
}

class Charger {
	String Brand;
	int power;
	
        public Charger(String Brand, int power) {
        super();
	    this.Brand = Brand;
	    this.power = power;
	}
	

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}

	public String getBrand() {
		return Brand;
	}

	public void setpower(int power) {
		 this.power = power;
	}

	public int getpower() {
		return power;
	}
}