package com.JavaProblems;

import java.util.Scanner;

public class BigInteger {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	java.math.BigInteger a = in.nextBigInteger();
    	java.math.BigInteger b = in.nextBigInteger();
    	
    	System.out.println(a.add(b));
    	System.out.println(a.multiply(b));
    	
    }
}

