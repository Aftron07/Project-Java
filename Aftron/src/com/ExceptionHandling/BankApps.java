package com.ExceptionHandling;

import java.util.Scanner;

public class BankApps {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.banking();

	}

}
class Bank{
	
	void banking() {
	System.out.println(" Bank Connection Estabilished");
	ATM card= new ATM ();
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
class ATM{
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


//2.	in the above program he exception was handled where it occurred (In the transaction Method ) 
//3.	however sometime the exception information must be passed to the caller of the method this is possible by rethrowing the exception has shown above
//4.	the throw keyword is used to propagate the exception object to the caller of the method  
//5.	this process of using the throw keyword to pass the exception object to the caller of the method is called as re-throwing an exception 
//6.	when a method is re throwing an exception a warning must be passed to the caller of the method so that it is ready to catch the exception object
//7.	the warning can be given by the throws keyword
//NOTE- the drawback of the throw keyword is that , the code written below it is not executed 
//8.	in order to execute a code below the throw keyword we must use finally 
