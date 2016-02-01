package com.JavaProblems;

import java.util.Arrays;
import java.util.Scanner;

public class GameJump {
	public static int[] A;
	public static	int m;
	public static int n;
	public static int[] visitedArray;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for (int c_i = 0; c_i < T; c_i++) {

			n = sc.nextInt();
			A= new int[n];
			visitedArray= new int[n];
			Arrays.fill(visitedArray,0);
			m = sc.nextInt();
			for (int n_i = 0; n_i < n; n_i++) {
				A[n_i]= sc.nextInt();
				//System.out.println("ele : i"+ n_i +" value is: " + A[n_i]);
			}
			//System.out.println("going");
			int temp =0;
			//System.out.println(temp);
			isPossible(temp);	
		}

	}
	private static void isPossible( int i) {
		System.out.println("i : "+i + " Array visited : "+ Arrays.toString(visitedArray));
		//if(visitedArray[i] != true){
		System.out.println("hey true");
		System.out.println("called for i: "+i);
			visitedArray[i]++;
		if(i>n || i+m >= n || i==n-1){
				System.out.println("YES");
				return; 
		}else {
			System.out.println("checker: "+ (i+m < n) + " "+ (A[i+m]==0)+" "+ (visitedArray[i+m]<3));
			System.out.println("Pa: "+ (i+m)+" "+ A[i+m] +" "+ A[i+m+1]+" "+ A[i+m-1]);
			if (A[i+1]==0 && visitedArray[i+1] <3){
				System.out.println("here" +(i+1));
				isPossible(i+1);			
			}else if (i-1>0 && A[i-1]==0 && visitedArray[i-1] <3){
				System.out.println("here1");
				isPossible(i-1);
			}else if(i+m < n && A[i+m]==0 && visitedArray[i+m]<3){
				System.out.println("here2");
				isPossible(i+m);
			}else{
				System.out.println("NO");
				return;
			}
			}
	}
}