package com.Algos;


import java.util.Scanner;

public class SherlockandTheBeast {

    public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t-- > 0) {
        numberBuilder(in.nextInt());
    }
    in.close();
}

private static void numberBuilder(int n) {
    // TODO Auto-generated method stub
    int noofFives = 0, noofThrees = 0;

    int newNumber = n;
    while (newNumber % 3 != 0) {
        newNumber -= 5;
        noofThrees += 1;
        if (newNumber < 3 && newNumber != 0) {
            System.out.println("-1");
            return;
        }
    }

    noofFives = newNumber / 3;
    System.out.println("5: "+noofFives+" 3: "+noofThrees);
    String finalNumber = "";

    for (int i = 0; i < noofFives; ++i) 
        finalNumber += "555"; 
    for (int i = 0; i < noofThrees; ++i)
        finalNumber += "33333";

    for (int i = 0; i < finalNumber.length(); ++i)
        System.out.print(finalNumber.charAt(i));
    System.out.println();
}
}
