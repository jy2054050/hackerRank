package com.JavaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ComparatorExample {
	public static void main(String[] args) throws NumberFormatException, IOException {
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       
		  int N=Integer.parseInt(br.readLine().trim());
		  String s;
		  StringTokenizer st;
		  ComparatorExample_Player Player[]=new ComparatorExample_Player[N];
		  ComparatorExample_Checker check=new ComparatorExample_Checker();
		  for(int i=0;i<N;i++)
		  {
			  s=br.readLine().trim();
			  st=new StringTokenizer(s);
			  Player[i]=new ComparatorExample_Player();
			  Player[i].name=st.nextToken();
			  Player[i].score=Integer.parseInt(st.nextToken());
		  }
		 
		  Arrays.sort(Player,check.desc);
		  for(int i=0;i<Player.length;i++)
		  {
				System.out.printf("%s %s\n",Player[i].name,Player[i].score);
		  }

			
	    }
	}
