package com.demo;

import java.util.*;

public class JaggedArray{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of class:");
		int m = sc.nextInt();
		
		System.out.println("Enter no of students:");
		int n = sc.nextInt();
		
		int a[][] = new int[m][n];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the total no.of students in class" + i);
			a[i] = new int[sc.nextInt()];
		}

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {       
			  System.out.print("Please enter the marks of class " + i + " student " + j + " ");
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}