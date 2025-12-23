package com.demo;

public class StringBufferMethod{
    public static void main(String args[])  {
    	StringBuffer sb = new StringBuffer();
    	sb.ensureCapacity(31);
        System.out.println(sb.capacity());
    	sb.append("Ronaldo");
    	sb.trimToSize();
    	System.out.println(sb.capacity());
    	sb.append("is a great footballer ");
    	System.out.println(sb.capacity());
    }}