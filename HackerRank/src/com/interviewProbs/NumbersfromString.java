package com.interviewProbs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumbersfromString {
	 public static void main(String[] args)
	    {
	        /*Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();*/
	       List<String> a=  func("Dhoni7 notout at183*runs in 145balls&hit15fours&ten6s!");
	        //List<String> a = func(str);
	        
	       for(String  x : a) {
	            System.out.println(x);
	        }
	    }
	   
	    public static List<String> func(String str)
	    {
	        str = str.replaceAll("[^0-9]+", " ");
	        System.out.println(str);
	        System.out.println(Arrays.asList(str.trim().split(" ")));
	        List<String> arr = Arrays.asList(str.trim().split(" "));
	       return arr;
	    }
	}