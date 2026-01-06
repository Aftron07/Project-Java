package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemoApp {

	public static void main(String[] args) {

       System.out.println("connection established");
       Scanner sc = new Scanner (System.in);
       System.out.println("please enter value 1");
       int a= sc.nextInt();
       System.out.println("please enter value 2");
       int b=sc.nextInt();
       int c=a/b;
       System.out.println(c);
       System.out.println("connnection terminated");
	}

}