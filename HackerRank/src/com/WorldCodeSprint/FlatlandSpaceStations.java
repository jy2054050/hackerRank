package com.WorldCodeSprint;

import java.util.Scanner;

public class FlatlandSpaceStations {
private static int max=0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
       for(int i=0;i<n;i++){
    	   int x=findclosest(c,i);
    	   System.out.println("x:"+findclosest(c,i));
    	   max= Math.max(max,x);
       }
       System.out.println(max);
    }

	private static int findclosest(int[] c, int i) {
		int distance = Math.abs(c[0] - i);
		int idx = 0;
		for(int c_i = 1; c_i < c.length; c_i++){
		    int cdistance = Math.abs(c[c_i] - i);
		    if(cdistance < distance){
		        idx = c_i;
		        distance = cdistance;
		    }
		}
		int theNumber = c[idx];
		return Math.abs(theNumber-i);
	}
}