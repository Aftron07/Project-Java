package com.Inheritance;
public class Player{
	String name ;
	int age;
	String gender;
	}
class Football extends Player{
	int goals ;
	int assist;
	public Football(String name,int age,String gender, int goals,int assist) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.goals=goals;
		this.assist=assist;
		
	}
	public int getGoals() {
		return goals;
	}
	public int assist() {
		return assist;
	}
	public String name() {
		return name;
	}
	
}

public class PlayerApp{
	public static void main (String args[]) {
		Football fb = new Football(2,10);
		System.out.print(fb.goals);
		System.out.print(fb.name);
		
		
	}
	
	
}

