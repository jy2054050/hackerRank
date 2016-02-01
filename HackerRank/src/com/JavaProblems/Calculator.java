package com.JavaProblems;

import java.io.IOException;
import java.util.Scanner;

 class Calculate {

		public static Calculate output = new Calculate();
		public static final double PI = 3.14159265;
		Scanner sc= new Scanner(System.in);
		public double getDoubleVal() throws IOException {
		    
		    double ip =sc.nextDouble();
		    if(ip<=0)
		        throw new NumberFormatException(" All the values must be positive");
		    return ip;
		}

		public int getINTVal() throws IOException{
		    int ip = sc.nextInt();
		    if(ip<=0)
		        throw new NumberFormatException(" All the values must be positive");
		    return ip;
		}

		public static double main(int a) {
		    return a * a * a;
		}

		public static double main(int l, int b, int h) {
		    return l * b * h;
		}

		public static double main(double r) {
		    double result = (2 * PI * r * r * r)/3;
		    return result;
		}

		public static double main(double r, double h) {
		    return PI * r * r * h;
		}

		public static Calculate get_Vol() {
		    return output;
		}

		public void display(double volume) {
		    System.out.printf("%.3f",volume);
		}
		}
