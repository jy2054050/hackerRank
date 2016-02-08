package com.Algos;

import java.util.Arrays;
import java.util.Scanner;

public class GameofThrones {
	public static int [] arr = new int [26];
	public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String s = myScan.nextLine();
       
        String ans = null;
        s=s.toLowerCase();
		Arrays.fill(arr, 0);
		s=s.trim();
		ans = travarseArray(s);
        System.out.println(ans);
        myScan.close();
    }
	
	
	private static String travarseArray(String s) {
		for (int j=0;j<s.length();j++){
			arr[(int)s.charAt(j) - (int)'a']++;
		}
		String var="YES";
		int counter=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 !=0) {
				counter++;
			}
		}
		if (counter >1) var = "NO";
		return var;
	}
}
