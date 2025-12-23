package com.demo;

public class Concate {
    public static void main(String args[]) {
String s1 ="Arth";
String s2 = "Arth";
String s3 = "md "+ "Arsh";
String s4 ="md Arsh";

if(s3==s4) {
	System.out.println("Referance are eQual");

}
else {
	System.out.println("Referance are not eQual");
}
if(s3.equals(s4)) {
	System.out.println("Value are eQual");

}
else {
	System.out.println("values are not eQual");
    }   
}   
}