package com.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountWords {
	public static void main(String[] args)
    {
		/* Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       //List<String> a=  func("He is a very very good boy, isn't he?");
       List<String> a = null;
       if(str.length()>=1 && str.length()<=400000)     { 
    	       a = func(str);
    	}
       
        System.out.println(a.size());
       for(String  x : a) {
            System.out.println(x);
        }*/
       
       Scanner in=new Scanner(System.in); 
       String str=in.nextLine(); 
       str=str.replaceAll("\\s+", " ");
       if(str.length()>=1 && str.length()<=400000)     { 
       String[] word;
       String regex="[!,?._\'@[ ]+]+"; 
       word=str.replaceAll("\\s+", " ").split(regex); 
       System.out.println(word.length);
       for(String s : word)
    	   System.out.println(s);
       }
    }
   
    public static List<String> func(String str)
    {
        str = str.replaceAll("[^a-zA-z]", " ");
        System.out.println(str);
        str=str.replaceAll("\\s+", " ");
        System.out.println(Arrays.asList(str.trim().split(" ")));
        List<String> arr = Arrays.asList(str.trim().split(" "));
       return arr;
    }
}