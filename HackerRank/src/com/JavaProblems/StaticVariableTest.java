package com.JavaProblems;

import java.util.Scanner;

public class StaticVariableTest {
	 
	 public static boolean flag;
	 static Scanner sc=new Scanner(System.in);
	 public static int B = sc.nextInt();
	 public static int H= sc.nextInt();
	 static{
		 if((B<=0)||(H<=0)){
		  System.out.println("java.lang.Exception: Breadth  and height must be positive");
		  }else {
	   flag=true;
	   }
   }

	 
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class