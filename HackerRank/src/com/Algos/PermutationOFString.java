package com.Algos;


public class PermutationOFString {
	static void permute(char a[], int l, int r) {
		System.out.print(getString(a) +" : ");
		if (l == r)
			System.out.println("$$$$$$$$ : "+getString(a));
		else {
			for (int i = l; i <= r; i++) {
				System.out.print("l: "+l +" r: "+r+" "+" i :"+i+" ");
				swap(a, l, i);
				permute(a, l + 1, r);
				swap(a, l, i); // backtrack
			}
		}
	}

	public static void main(String[] args) {
		String inputString = "ABC";
		char str[] = inputString.toCharArray(); // convert input string into
												// char array
		int n = str.length;
		permute(str, 0, n - 1);
	}

	static String getString(char a[]) {
		StringBuffer str = new StringBuffer();
		for (char c : a) {
			str.append(c);
		}
		return str.toString();
	}

	static void swap(char a[], int l, int r) {
		char temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
}
