package com.JavaProblems;

class Add {

		public int add(int... n) {
			int total=0;
	        String str="";
			for ( int d : n )  { 
				total= total+d;  
	            str=str+(d)+"+";
				//System.out.print(d+"+");                
			}
			str=str.substring(0,str.length()-1);
	         System.out.print(str+"="+total);
		     	return total;
		    }
		public static void main(String[] args) {
			Add a = new Add();
			a.add(2,3,4,5);
		}
		}
