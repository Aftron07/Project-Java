package com.ExceptionHandling;

public class StackOverflow {

//	public static void main(String args[]) {
//		disp();
//	}
//	static void disp() {
//		System.out.println("hello from disp");
//		disp();
//	}

		
// this is the 0stsck over flow problem 
////////////////////////////////////////////////////////////////////////////////////
public static void main(String args[]) {
	disp();
}
static void disp() {
	System.out.println("hello from disp");
	try {
		disp();
	}catch (Error e) {
		System.out.println("Error handled");
}
}
}// this is the 0stsck over flow solution 