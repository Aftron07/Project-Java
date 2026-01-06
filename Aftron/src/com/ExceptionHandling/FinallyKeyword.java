package com.ExceptionHandling;

import java.util.Scanner;

public class FinallyKeyword {

	public static void main(String[] args) {
		Bank1 b=new Bank1();
		b.banking();

	}

}
class Bank1{
	
	void banking() {
	System.out.println(" Bank Connection Estabilished");
	ATM1 card= new ATM1 ();
	try{
		card.transaction();
	}
	catch (Exception e) {
	//	e.printStackTrace();
		System.out.println("info received by the bank your amount will be refunded within 24 hours");
	}
	System.out.println(" Bank Connection terminated");
	
}
}
class ATM1{
	void transaction()throws Exception {
		System.out.println("  ATM Connection Estabilished");
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Please Enter Value 1:");
	     
	     
	     
	     int a = sc.nextInt();
	     System.out.print("Please Enter Value 2:");
	     int b = sc.nextInt();
		      try {
		    	  int c = a / b;
		    	  System.out.println(c);
		      }
		      catch (Exception e)
		      {
		    	  System.out.println("  Exception handled by Atm"); 
		    	  throw e;
		      }
		      finally {
		    	  System.out.println("  ATM Connection Terminated");
		      }
		 
	}
}