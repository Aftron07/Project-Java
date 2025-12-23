package com.demo;

public class StringEquals {
    public static void main(String args[]) {
String s1 ="Arth";
String s2 = "Arth";

if(s1==s2) {
	System.out.println("Referance are eQual");

}
else {
	System.out.println("Referance are not eQual");
}
if(s1.equals(s2)) {
	System.out.println("Value are eQual");

}
else {
	System.out.println("values are not eQual");
    }   
}   
}