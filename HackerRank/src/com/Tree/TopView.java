package com.Tree;

public class TopView {
	public static void main(String[] args) {
		Node one = new Node();Node two = new Node();Node three = new Node();
		Node four = new Node();Node five = new Node();Node six = new Node();
		Node seven = new Node();
		
		one.data =3; two.data =5; three.data=2; four.data=1; five.data= 4;six.data=6;seven.data=7;
		
		one.left=two; one.right=three; two.left=four;two.right =five; 
		one.right=three; three.left=six;four.left=seven;
		
		topView(one);
	}
	static void topView(Node root) {
	
		topViewLeft(root.left);
		System.out.print(root.data+" ");
		topViewRight(root.right);
	}
	static void topViewLeft(Node root){
		if (root.left !=null) topViewLeft(root.left);
		System.out.print(root.data+" ");
	}
	static void topViewRight(Node root){
		System.out.print(root.data+" ");	
		if (root.right !=null) topViewRight(root.right);
			
	}
}
