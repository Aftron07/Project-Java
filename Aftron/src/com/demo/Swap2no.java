package com.demo;
import java.util.Scanner;

public class Swap2no{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        
        int c =0;
        
        b=a;
        c=b;
        a=b;
        
        System.out.println("now first no. is"+b);
        System.out.println("now Second no. is"+a);
        
        
        
    }
   }