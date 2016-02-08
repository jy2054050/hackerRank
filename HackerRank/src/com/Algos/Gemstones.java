package com.Algos;

import java.util.Arrays;
import java.util.Scanner;

public class Gemstones {

	public static int [] arr = new int [26];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		Arrays.fill(arr, 0);
		for (int i = 0; i <n; i++) {
			String s= sc.next();
			System.out.println("s: "+s);
			s=s.trim();
			s=s.toLowerCase();
			travarseArray(s);
			
		}
		
		int counter =0;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]==n) counter ++;
		}
		System.out.println(counter);
	}
	private static void travarseArray(String s) {
		for (int j=0;j<s.length();j++){
			arr[(int)s.charAt(j) - (int)'a']++;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]+" ");		
		}
	}
}
