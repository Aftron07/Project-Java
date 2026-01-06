package com.ExceptionHandling;
import java.util.*;

public class TestApps {

	public static void main(String[] args) {
		System.out.println("Main Connection Estabilished");
		Test1 t1 = new Test1();
		t1.alpha();
		System.out.println("Main Connection Terminated");
	}

}

 class Test1 {
	 void alpha() {
		 System.out.println("Test1 Connection Estabilished");
		 Test2 t2 = new Test2();
		 t2.beta();
		 System.out.println("Test1 Connection Terminated");
	 }
 }
 
 class Test2 {
	 void beta() {
		 System.out.println("Test2 Connection Estabilished");
		 Test3 t3 = new Test3();
		 t3.gama();
		 System.out.println("Test2 Connection Terminated");
	 }
 }
 
 class Test3 {
	 void gama() {
		 System.out.println("Test3 Connection Estabilished");
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Please Enter Value 1");
	     int a = sc.nextInt();
	     System.out.println("Please Enter Value 2");
	     int b = sc.nextInt();
	     //Exception is handled by this 
	     try {
	    	 int c = a / b;
	    	 System.out.println(c);
			}
			catch (Exception e){
				System.out.println("Exception handled by Gamma");
			}
		 System.out.println("Test3 Connection Terminated");
	 }
 }