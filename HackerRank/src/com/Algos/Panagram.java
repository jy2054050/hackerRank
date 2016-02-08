package com.Algos;

import java.util.Arrays;
import java.util.Scanner;

public class Panagram {

	public static boolean [] arr = new boolean [26];
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String s=sc.nextLine();//"We promptly judged antique ivory buckles for the prize ";
//	/	String s="We promptly judged antique ivory buckles for the prize ";
		s=s.toLowerCase();
		Arrays.fill(arr, false);
		s=s.trim();
		s=s.replaceAll(" ","");
		System.out.println(panagram(s));
	}

	private static String panagram(String s) {
		System.out.println(s);
		for (int i=0;i<s.length();i++){
			arr[(int)s.charAt(i) - (int)'a']=true;
		}
		return travarseArray();
	}

	private static String travarseArray() {
		String var="pangram";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=true) {
				var="not pangram";
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+":"+arr[i]+" ");
		}
		
		return var;
	}

}
