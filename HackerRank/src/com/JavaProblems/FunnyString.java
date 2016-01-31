package com.JavaProblems;

import java.util.Scanner;

public class FunnyString {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int i=0;i<n;i++){
	        	String s = in.next();
	        	String reverse = "";
	        	 for ( int j = s.length() - 1 ; j >= 0 ; j-- )
	                 reverse = reverse + s.charAt(j);
	        	System.out.println(funny(s,reverse));
	              }
	        
	        }

		private static String funny(String s, String reverse) {
			//System.out.println(s+" : "+reverse);
			boolean Isfunny=true;
			for(int i=1;i<s.length();i++){
				if (Math.abs((s.charAt(i) - s.charAt(i-1))) != Math.abs((reverse.charAt(i)-reverse.charAt(i-1)))){
					Isfunny =false;
					
				}
				//System.out.println(Isfunny + " : "+Math.abs((s.charAt(i) - s.charAt(i-1)))+" : "+ Math.abs((reverse.charAt(i)-reverse.charAt(i-1))));
			}//System.out.println(Isfunny);
			if (Isfunny ==true) {return "Funny";}
			else {return "Not Funny";}
			
		}
}