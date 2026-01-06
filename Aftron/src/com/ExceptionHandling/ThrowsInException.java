package com.ExceptionHandling;
import java.util.*;

public class ThrowsInException {

	public static void main(String[] args) {
		System.out.println("Main Connection Estabilished");
		 Tests33 t1= new Tests33();
		 try{
				t1.gama();
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception Handled By Main");
			}
		System.out.println("Main Connection Terminated");
	}

}

 
 
 class Tests33 {
	 void gama() throws Exception{
		 System.out.println("Test1 Connection Estabilished");
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Please Enter Value 1");
	     int a = sc.nextInt();
	     System.out.println("Please Enter Value 2");
	     int b = sc.nextInt();
		      int c = a / b;
		      System.out.println(c);
		 System.out.println("Test3 Connection Terminated");
	 }
 }