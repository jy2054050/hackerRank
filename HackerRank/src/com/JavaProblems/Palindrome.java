package com.JavaProblems;

import java.util.Scanner;

public class Palindrome {
	
	 public static void main(String[] args) {
	      
		 	boolean palindrome=true; 
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        int i=0;
	        int j = A.length()-1;
	        while(i<j){
	        	if(A.charAt(i) != A.charAt(j)) palindrome=false;
	        	i++;
	        	j--;
	        }
	        if(palindrome) System.out.println("Yes");
	        else System.out.println("No");
	    }
	}