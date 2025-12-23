package com.demo;

public class intern{
    public static void main(String args[])  {
String s1 =new String("Arth");
String s2 = s1.intern();
String s3 = s1.intern();


if(s2==s3) {
	System.out.println("Referance are eQual");

}
else {
	System.out.println("Referance are not eQual");
}
if(s2.equals(s3)) {
	System.out.println("Value are eQual");

}
else {
	System.out.println("values are not eQual");
    }   
}   
}