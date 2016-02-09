package com.JavaProblems;

import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeSample {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] num= new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
           }
        int max=0;
        HashSet<Integer> temp = new HashSet<Integer>();
        for (int j = 0; j < num.length-m +1; j++) {
			for (int z = 0; z < m; z++) {
				temp.add(num[j+z]);
				//System.out.println("ARR: "+num[j+z]);
			}
        	//System.out.println(temp);
			max= Math.max(max,temp.size());
			temp.clear();
		}
        System.out.println(max);
    }
}
