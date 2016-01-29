package com.WorldCodeSprint;

import java.util.Scanner;

public class MarsExploration {
	static int counter =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s=s.toUpperCase();
		for(int i=0; i < s.length();){
			String temp= s.substring(i,i+3);
			counterFun (temp);
			i=i+3;
			//System.out.println(temp);
		}
			System.out.println(counter);
	}

	private static void counterFun(String s) {
		String ideal= "SOS";
		for (int i=0;i<ideal.length();i++){{
			if(s.charAt(i)!= ideal.charAt(i)){
				counter++;
			}
		}

	}
    }
}