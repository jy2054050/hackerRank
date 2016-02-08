package com.Algos;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String temp=sc.next();
		System.out.println(alternating(temp));
		}
	}

	private static int alternating(String temp) {
		int counter =0;
		char cur=temp.charAt(0);
		
		for (int i = 1;i < temp.length();) {
			if (temp.charAt(i)== cur){
				counter++;
				i++;
			}
			else{
				cur=temp.charAt(i);
				i++;
			}					
		}
		return counter;	
	}
}
	
