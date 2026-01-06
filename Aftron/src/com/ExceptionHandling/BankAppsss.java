package com.ExceptionHandling;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

import java.util.*;

public class BankAppsss {

	public static void main(String[] args) {
		Banking b = new Banking();
		b.banking();
	}

}

class Banking {
	void banking() {
		ATM1 a = new ATM1();
		try {
			a.accountInfo();
			a.verify();
		}catch(InvalidinputException e) {
			System.out.println("Wrong pin");
			System.out.println("Attempt 2");
			
			try {
				a.accountInfo();
				a.verify();
			}
			catch(Exception e1){
					System.out.println("Wrong pin");
					System.out.println("Attempt 3");
					
					try {
						a.accountInfo();
						a.verify();
					}
					catch(Exception e2){
							System.out.println("Wrong pin");
							System.out.println("You have been blocked for 24 hrs");
							
						}
					
				}

			
		}
		
		
				
			}
			

		
		
		
	}


class ATM1 {
	int accno = 2201;
	String pass = "Aftab@3803";
	int useracc;
	String userpass;

	void accountInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter your account number: ");
		useracc = sc.nextInt();
		System.out.print("Please Enter your password: ");
	    userpass = sc.next();
	}

	void verify() throws InvalidinputException {
		if (accno == useracc && pass.equals(userpass)) {
			System.out.println("Your Uername and Password is Matched");
		} else {
			InvalidinputException e = new InvalidinputException();
			System.out.println(e.getMessage());
			throw e;
		}
	}
}

class InvalidinputException extends Exception {
	public String getMessage() {
		return "Wrong Credentials";
	}
}