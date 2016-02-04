package com.JavaProblems;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateINSet {

	 public static void main(String[] args) {
	        
		    Scanner sc = new Scanner(System.in);
		    int count =0;
		    int n = sc.nextInt();
		    sc.nextLine();

		    HashSet<String> hs = new HashSet<String>();
		        for(int i=0;i<n;i++){
		            String e = sc.nextLine();
		            hs.add(e);
		            System.out.println(hs.size());
		        }
		}
}