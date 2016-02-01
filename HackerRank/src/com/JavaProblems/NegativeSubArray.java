package com.JavaProblems;

import java.util.Scanner;

public class NegativeSubArray {

	private static int count;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			int sum=0;
			for(int k=j;k<arr.length;k++){
				sum+=arr[k];
				if(sum<0){ count++;
				System.out.println(j +" : "+k);
			}
			}
		}
		System.out.println(count);
	}
}
