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
		int i = 1;
		for (; i < temp.length()-1;) {
			if (temp.charAt(i)== cur){
				counter++;
				i++;
			}else{
				cur=temp.charAt(i);
				i++;
			}					
		}
		return counter;	
	}
}
	
