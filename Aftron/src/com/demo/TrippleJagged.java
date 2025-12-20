package com.demo;

import java.util.Scanner;

public class TrippleJagged {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of colleges: ");
        int m = sc.nextInt();

        int[][][] a = new int[m][][];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter number of classes in college " + i + ": ");
            int n = sc.nextInt();
            a[i] = new int[n][];

            for (int j = 0; j < n; j++) {
                System.out.print("Enter number of students in college " + i + " class " + j + ": ");
                int o = sc.nextInt();
                a[i][j] = new int[o];

                for (int k = 0; k < o; k++) {
                    System.out.print("Enter Student : ");
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Output:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println(a[i][j][k] + " ");
                }
                
            }
           
        }

        
    }
}
