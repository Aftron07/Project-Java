
package com.encapsulation;
public class Signatures{
    public static void main(String[] args) {
        System.out.println("Main with String[]");
        main(10);
        main("Java");
    }

    public static void main(int x) {
        System.out.println("Overloaded main with int: " + x);
    }

    public static void main(String s) {
        System.out.println("Overloaded main with String: " + s);
    }
}
