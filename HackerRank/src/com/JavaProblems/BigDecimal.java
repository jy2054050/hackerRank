package com.JavaProblems;

import java.util.Scanner;
import java.util.TreeSet;

public class BigDecimal {
	public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        TreeSet<BigDecimal> list = new TreeSet<BigDecimal>();
        int testCase = sc.nextInt();

        while(testCase-- > 0)
            list.add(new BigDecimal(sc.nextBigDecimal()));

        System.out.println(list); //ascending order
        System.out.println(list.descendingSet()); //descending order
    }
}