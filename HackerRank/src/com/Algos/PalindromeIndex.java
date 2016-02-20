package com.Algos;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0;i<T;i++){
			String A=sc.next();
			A=A.trim();
			A=A.toLowerCase();
			System.out.println(PIndex(A));
		}
      }
	private static int PIndex(String str){
		int myVar=0;
		int index=0;
		int i=0; int j=str.length()-1;
		while(i<j){
			if(str.charAt(i)== str.charAt(j)) {
				i++;j--;
			}else if(str.charAt(i+1)== str.charAt(j)){
				myVar++;
				index=i;
				i=i+2;
			}else if (str.charAt(i)== str.charAt(j-1)){
				myVar++;
				index=j;
				j=j-2;
			}
		}
		
		if(myVar==0) return -1;
		else return index;
			
	}

}
