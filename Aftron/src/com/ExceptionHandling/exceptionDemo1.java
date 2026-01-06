package com.ExceptionHandling;
import java.util.Scanner;
public class exceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		       System.out.println("connection established");
		       Scanner sc = new Scanner (System.in);
		       System.out.println("please enter value 1");
		       int a= sc.nextInt();
		       System.out.println("please enter value 2");
		       int b=sc.nextInt();
		    	   int c=a/b;
		    	   System.out.println(c);
		       }
		       catch (Exception e) {
		    	   e.printStackTrace();
		    	   System.out.println("divide by zero is not allowed ");
		       }
		       System.out.println("connnection terminated");
			}		
}