package com.Tree;

public class PreorderTraversal {

	public static void main(String[] args) {
		Node one = new Node();Node two = new Node();Node three = new Node();
		Node four = new Node();Node five = new Node();Node six = new Node();
		
		one.data =3; two.data =5; three.data=2; four.data=1; five.data= 4;six.data=6;
		
		one.left=two; one.right=three; two.left=four;two.right =five; 
		one.right=three; three.left=six;
		
		Preorder(one);
	}
	static void Preorder(Node root) {
			System.out.print(root.data+" ");
			if(root.left !=null) Preorder(root.left);
			if(root.right !=null) Preorder(root.right);
		
	}
}
