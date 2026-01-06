package com.ExceptionHandling;
import java.util.*;

public class TestApps1{

	public static void main(String[] args) {
		System.out.println("Main Connection Estabilished");
		Test11 t1 = new Test11();
		t1.alpha();
		System.out.println("Main Connection Terminated");
	}

}

 class Test11 {
	 void alpha() {
		 System.out.println("Test1 Connection Estabilished");
		 Test22 t2 = new Test22();
		 t2.beta();
		 System.out.println("Test1 Connection Terminated");
	 }
 }
 
 class Test22 {
	 void beta() {
		 System.out.println("Test2 Connection Estabilished");
		 Test33 t3 = new Test33();
		 
		 try {
			 t3.gama();
	    	 
			}
			catch (Exception e){
				System.out.println("Cannot divided by zero");
			}
		 System.out.println("Test2 Connection Terminated");
	 }
 }
 
 class Test33 {
	 void gama() {
		 System.out.println("Test3 Connection Estabilished");
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Please Enter Value 1");
	     int a = sc.nextInt();
	     System.out.println("Please Enter Value 2");
	     int b = sc.nextInt();
	     //Exception is handled by this 
	     
	    	 int c = a / b;
	    	 System.out.println(c);
			
		 System.out.println("Test3 Connection Terminated");
	 }
 }