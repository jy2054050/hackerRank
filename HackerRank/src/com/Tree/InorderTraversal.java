package com.Tree;

public class InorderTraversal {
	public static void main(String[] args) {
		Node one = new Node();Node two = new Node();Node three = new Node();
		Node four = new Node();Node five = new Node();Node six = new Node();
		
		one.data =3; two.data =5; three.data=2; four.data=1; five.data= 4;six.data=6;
		
		one.left=two; one.right=three; two.left=four;two.right =five; 
		one.right=three; three.left=six;
		
		Inorder(one);
	}
	static void Inorder(Node root) {
			if(root.left !=null) Inorder(root.left);
			System.out.print(root.data+" ");
			if(root.right !=null) Inorder(root.right);
			
		
	}
}
