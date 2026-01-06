package com.ExceptionHandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
	System.out.println("connection established");
	Scanner sc = new Scanner (System.in);
	System.out.println("please enter value 1");
	int a= sc.nextInt();
	System.out.println("please enter value 2");
	int b=sc.nextInt();
	try {
		int c=a/b;
		System.out.println(c);
	}
	catch (Exception e){
		System.out.println("Exception Handled");
		
	}
	System.out.println("connnection terminated");
		}

	}
x