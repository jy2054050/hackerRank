package com.JavaProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapUses {

	   public static void main(String []argh)
	   {
		   Map map = new HashMap<String, Integer>();
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         map.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         Object ans=map.get(s);
	         if(ans ==null)System.out.println("Not found");
	         else System.out.println(s+"="+map.get(s));
	      }
	   }
	}