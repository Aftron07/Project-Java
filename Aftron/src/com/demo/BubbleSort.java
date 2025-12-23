package com.demo;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        

        int a[] = {10, 40, 30, 20 , 50};
        for (int m= 0 ; m<a.length;m++) {
        	System.out.println(a[m] + "    ");
        }
        
        
        System.out.println("<----------------------------------------->");
        for (int i = 0 ; i<a.length;i++) {
        	for (int j = 0; j<a.length-1;j++) {
        		if (a[j]>a[j+1]) {
        			int temp = a[j];
        	        a[j]= a[j+1];
        	        a[j+1]=temp;
        		}
        		
        	}
        	
        }
        for (int i= 0 ; i<a.length;i++) {
        	System.out.println(a[i] + "    ");
        }
        
        }
}
