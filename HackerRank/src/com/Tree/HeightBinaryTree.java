package com.Tree;

public class HeightBinaryTree {
	public static void main(String[] args) {
		Node one = new Node();Node two = new Node();Node three = new Node();
		Node four = new Node();Node five = new Node();Node six = new Node();
		Node seven = new Node();
		
		one.data =3; two.data =5; three.data=2; four.data=1; five.data= 4;six.data=6;seven.data=7;
		
		one.left=two; one.right=three; two.left=four;two.right =five; 
		one.right=three; three.left=six;four.left=seven;
		
		System.out.println(height(one));
	}
	static int height(Node root) {
		if (root.left==null && root.right==null) return 1;
		int l=0; int r=0;
		if(root.left !=null){
			l= height(root.left);	
		}
		
		if(root.right !=null){
			r=height(root.right);
		}		
		return Math.max(l,r)+1; 
		}
}
