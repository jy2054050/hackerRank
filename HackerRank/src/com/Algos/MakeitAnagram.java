package com.Algos;

import java.util.Arrays;
import java.util.Scanner;


/*Alice recently started learning about cryptography and found that anagrams are very useful.
Two strings are anagrams of each other if they have same character set (and frequency of characters) and same length.
For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.

Alice decides on an encryption scheme involving 2 large strings where encryption is dependent 
on the minimum number of character deletions required to make the two strings anagrams. 
She need your help in finding out this number.*/


public class MakeitAnagram {
	private static int [] a = new int [26];
	private static int [] b = new int [26];
	private static int counter=0;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		s1=s1.toLowerCase();s1=s1.trim();
		String s2=sc.next();
		Arrays.fill(a, 0);
		Arrays.fill(b, 0);
		s2=s2.toLowerCase();s2=s2.trim();
		System.out.println(NumberofDeletion(s1,s2));
		
    }
	private static int NumberofDeletion(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			a[(int)s1.charAt(i) - (int)'a']++;
		}
		for (int j = 0; j< s2.length(); j++) {
			b[(int)s2.charAt(j) - (int)'a']++;
		}
		return diff();
	}
	private static int diff() {
		/*for (int j = 0; j< a.length; j++) {
			System.out.print(a[j] + " " );
		}
		System.out.println();
		for (int j = 0; j< b.length; j++) {
			System.out.print(b[j] + " " );
		}
		System.out.println();*/
		for (int i = 0; i < 26; i++) {
			counter+= Math.abs(a[i]-b[i]);
		}
		return counter;
	}
}
