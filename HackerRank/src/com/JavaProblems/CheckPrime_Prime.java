package com.JavaProblems;

public class CheckPrime_Prime {

	public void checkPrime(int... N) {
		for (int n : N) {
			boolean temp = isPrime(n);
			if (temp) System.out.print(n+" ");
		}
		System.out.println();
	}

	 public static boolean isPrime(int n){
	    	boolean prime=true; 
	    	if (n%2 == 0) prime=false;
	    	if (n<=1) prime =false;
	    	if (n==2) prime =true;
	    	else {
	    	 for (int i = 3; i <= Math.sqrt(n); i = i+2){
	    	        if(n%i == 0){
	    	        	prime = false;
	    	        }
	    	    }
	    	}
	    	if(prime==true)return true;
	    	else return false;
	    	
	    }
}
