package com.JavaProblems;

import java.util.Scanner;

public class SeriesPrint {

	 public static void main(String[] args) {
   	  Scanner sc=new Scanner(System.in);
   	  int T = sc.nextInt();
   	for(int i=0;i<T;i++){ 
       int a=sc.nextInt();
   	  int b =sc.nextInt();
   	  int n=sc.nextInt();
   	  printSeries(a,b,n);
       }
   }


	private static void printSeries(int a, int b, int n) {
		int sum=a;
		for(int i=0;i<n;i++){
			sum += (Math.pow(2, i) *b);
			System.out.print(sum + " ");
		}
		
	}
}