package com.problems;

import java.util.Scanner;

public class MinABSdifference {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int [] A = new int[N]; 
       for(int i =0; i<N;i++){
    	   A[i]= sc.nextInt();
       }
       java.util.Arrays.sort(A);
       //printArray(A,N);
       System.out.println();
       int mindiff= findMinDiff(A,N);
       printMinDiff(A,N,mindiff);
    }
       
    private static void printMinDiff(int[] a, int N, int minDiff) {
    	for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
			int temp =Math.abs(a[i]-a[j]);
			if(temp==minDiff){
				System.out.print(a[i]+" "+a[j]+" ");
			}
		}
    }
}

	private static int findMinDiff(int[] a, int N) {
		int minDif=10000000;
		
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
			if (Math.abs(a[i]-a[j])<minDif) minDif = Math.abs(a[i]-a[j]);	
			}			
		}
		System.out.println(minDif);
		return minDif;
	}
}