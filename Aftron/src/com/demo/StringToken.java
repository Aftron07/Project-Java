package com.demo;
import java.util.*;

public class StringToken {
	    public static void main(String[] args) {
	        String s = "i am iron man";
	        StringTokenizer st = new StringTokenizer(s, " ");
	        String r = "";

	        while (st.hasMoreTokens()) {
	            String w = st.nextToken();
	            String rw = "";
	            for (int i = w.length() - 1; i >= 0; i--) {
	                rw = rw + w.charAt(i);
	            }
	            r = rw + " " + r;
	            
	            
	            
	            
	            
	        
	        }

	    }
	}
