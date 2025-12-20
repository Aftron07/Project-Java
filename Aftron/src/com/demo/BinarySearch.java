package com.demo;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want: ");
        int key = sc.nextInt();

        int a[] = {10, 20, 30, 40, 50, 60};
        int low =0;
        int high=a.length;
        int mid =(low + high)/2;
        boolean found = false;
        int idx=0;
        
        while( low <=high) {
        	if(a[mid]==key) {
            	found = true ;
            	idx = mid ;
            	break;
            	}
        	else if (key<a[mid]) {
        		high =mid-1;
        		mid=(low + high)/2;
        		}
        	else {
        		low= mid +1;
        		mid =(low+high)/2;
        		}
       
     

        if (found) {
            System.out.println("Key is present  :" + idx);
        } 
        else {
            System.out.println("Element is not present");
        }
        	
      }
        
    }
 }



        
