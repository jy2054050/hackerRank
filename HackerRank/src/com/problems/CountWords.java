package com.problems;

import java.util.Arrays;
import java.util.List;

public class CountWords {
	public static void main(String[] args)
    {
        /*Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();*/
       List<String> a=  func("He is a very very good boy, isn't he?");
        //List<String> a = func(str);
       
        System.out.println(a.size());
       for(String  x : a) {
            System.out.println(x);
        }
    }
   
    public static List<String> func(String str)
    {
        str = str.replaceAll("[^a-zA-z]", " "); //str = str.replaceAll(",", " ");
        /*str = str.replaceAll("", " "); str = str.replaceAll(".", " ");
        str = str.replaceAll("\\", " "); str = str.replaceAll("_", " ");
        str = str.replaceAll("'", " "); str = str.replaceAll("@", " ");
        str = str.replaceAll("+", " ");*/
        System.out.println(str);
        System.out.println(Arrays.asList(str.trim().split(" ")));
        List<String> arr = Arrays.asList(str.trim().split(" "));
       return arr;
    }
}