package com.demo;
import java.util.Scanner;

public class ArrayLec{
	public static void main (String args[]) {
		
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
    	System.out.println("Pls enter the no. class ");
    	int n = sc.nextInt();
		int a[][]=new int[n][];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Pls enter the no. of Student present in Class 0 " +i);
			int b =sc.nextInt();
			a[i]=new int [b];
			
		}

		for (int j=0;j<a[i].length;j++) {
		
		}
			System.out.print(a[i]+" ");
		}
		
		
	}
	
	
}