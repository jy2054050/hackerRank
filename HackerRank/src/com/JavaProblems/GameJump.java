package com.JavaProblems;

import java.util.Arrays;
import java.util.Scanner;

public class GameJump {
	public static int[] A;
	public static	int m;
	public static int n;
	public static boolean[] visitedArray;
	private static boolean result=false;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for (int c_i = 0; c_i < T; c_i++) {

			n = sc.nextInt();
			A= new int[n];
			visitedArray= new boolean[n];
			Arrays.fill(visitedArray,false);
			m = sc.nextInt();
			for (int n_i = 0; n_i < n; n_i++) {
				A[n_i]= sc.nextInt();
				}
			int temp =0;
			result=false;
			isPossible(temp);
			if(result) System.out.println("YES");
			else System.out.println("NO");
		}

	}
	private static void isPossible( int i) {
		if(i>n || i+m >= n || i==n-1){
			result =true;
			return; 
		}
		if(visitedArray[i] == true){
			return;
		}
		visitedArray[i]= true;

		if (i+1 < n && A[i+1]==0){
		isPossible(i+1);			
		}
		if (i-1>=0 && A[i-1]==0){
		isPossible(i-1);
		}
		if(i+m < n && A[i+m]==0){
		isPossible(i+m);
		}
	}
}