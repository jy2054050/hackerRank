package com.interviewProbs;

import java.util.Scanner;

public class MergeArrays {

	  public static void main(String args[])
	    {
	        int value;
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        if ((N>1000000) || (N<1)) return;
	        int[] A = new int[N];
	        for(int x=0;x<N;x++)
	        {
	            value = sc.nextInt();
	            if ((value>1000000) || (value<0)) return;
	            A[x]=value;
	        }
	        int M = sc.nextInt();
	        if ((M>1000000) || (M<1)) return;
	        int[] B = new int[M];
	        for(int x=0;x<M;x++)
	        {
	            value = sc.nextInt();
	            if ((value>1000000) || (value<0)) return;
	            B[x]=value;
	        }
	        int[] ans = merge(A,B);
	        for(int x=0;x<ans.length;x++) System.out.printf("%d ",ans[x]);
	    }

	public static int[] merge(int[] a, int[] b)
	{

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])      
	            answer[k++] = a[i++];

	        else       
	            answer[k++] = b[j++];              
	    }

	    while (i < a.length) 
	        answer[k++] = a[i++];


	    while (j < b.length)   
	        answer[k++] = b[j++];

	    return answer;
	}   
	   

	}