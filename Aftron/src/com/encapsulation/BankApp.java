package com.encapsulation;
import java.util.*;

public class BankApp{
	public static void main (String argas[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount you want to deposit ");
        Bank b= new Bank();
		int bal =sc.nextInt();
		b.setBalance(bal);
		System.out.println("your current baklance : "+b.getBalance());
        System.out.println("please enter amount to withdraw ");
          int w=sc.nextInt();
           int upd_bal=b.getBalance()-w;
           b.setBalance(upd_bal);

         System.out.println("your current balance : "+b.getBalance());

	
	}
}
class Bank {
	private int balance ;
	public void setBalance(int bal) {
		if(bal>0) {
			balance=bal;
		}
		else {
			System.out.println("Invalid Output ");
		}
	}
	public int getBalance() {
		return balance;
	}
}