package com.ExceptionHandling;
import java.util.Scanner;
public class ExceptionDemo2 {

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
		    	   
		    	   System.out.println("please enter size of an array");
		    	   int size =sc.nextInt();
		    	    
		    	   int arr[]=new int[size];
		    	   
		    	   System.out.println("please enter index no.arr");
		    	   int n=sc.nextInt();
		    	   arr[n]=999;
		      }
		catch (ArithmeticException e) {
	    	   System.out.println("divide by zero is not allowed ");
	       }
		catch (ArrayIndexOutOfBoundsException e) {
	    	   System.out.println("The index is either negative or greater than or equal to the size of the array. ");
	       }
		catch (NegativeArraySizeException e) {
	    	   System.out.println(" array with negative size is given , Enter positive array ");
	       }
		       
		       System.out.println("connnection terminated");    
			}		
}