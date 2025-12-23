package com.demo;

public class Calculator {

    public static void main(String[] args) {
        Calculator c = new Calculator();
       //1st
        c.adds();
        //2nd
        int res= c.add();
        System.out.println(res);
        //3rd
        c.add(2,20);
        //4th
        int Mul= c.mul(3,4);
        System.out.println(Mul);
    }
//1st type of method (no i/p--no o/p)
    void adds() {
        int a = 5;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
  //2nd type of method (no i/p-- o/p)
    int add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
  //3rd type of method ( i/p--  no o/p)
    void add(int a,int b ) {
    	int c=a+b;
    	System.out.println(c);
    }
  //4th type of method ( i/p-- o/p)
    int mul (int a,int b ) {
    	int c=a*b;
    	 return c;
    }
}
