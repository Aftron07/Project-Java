package com.demo;
import java.util.Scanner;

public class Searching3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want: ");
        int m = sc.nextInt();

        int a[] = {1, 2, 3, 4, 5};
        boolean found = false;
        int idx=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == m) {
                found = true;
                idx =i;
                break;
            }
        }

        if (found) {
            System.out.println("Element is present  :" + idx);
        } else {
            System.out.println("Element is not present");
        }
    }
}
