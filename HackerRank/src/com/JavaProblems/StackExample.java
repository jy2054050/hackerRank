package com.JavaProblems;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
			System.out.println(isCorrect(input));
		}

	}

	private static boolean isCorrect(String input) {
		Stack<Character> st1 = new Stack<Character>();
		Stack<Character> st2 = new Stack<Character>();
		Stack<Character> st3 = new Stack<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) =='(') st1.push('(');
			if(input.charAt(i) =='[') st2.push('[');
			if(input.charAt(i) =='{') st3.push('{');

			try{
				if(input.charAt(i) ==')') st1.pop();
			}catch(EmptyStackException e){
				return false;
			}
			try{
				if(input.charAt(i) ==']') st2.pop();
			}catch(EmptyStackException e){
				return false;
			}
			try{
				if(input.charAt(i) =='}') st3.pop();
			}catch(EmptyStackException e){
				return false;
			}
		//	System.out.print(input.charAt(i)+" : ");	
			
		}
		if (st1.isEmpty() && st2.isEmpty() && st3.isEmpty()) return true ;
		else return false;
		// TODO Auto-generated method stub
		
	}
}