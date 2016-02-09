package com.JavaProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InnerClassAccess {
	
	public static void main(String[] args) throws Exception {
		Do_Not_Terminate.forbidExit();	

		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int num=Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

			//InnerClassAccess.Inner.Private nc= new InnerClassAccess.Inner.Private();
			  Inner in = new Inner();
			  o = in.new Private(); 
			  String str=   ((InnerClassAccess.Inner.Private) o).powerof2(num);
			  System.out.println(num + " is "+ str);
			System.out.println("An instance of class: "+o.getClass().getCanonicalName()+" has been created");
			
		}//end of try
		
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}//end of main
	static class Inner
	{
		private class Private{
			private String powerof2(int num)
			{
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}//end of Solutio